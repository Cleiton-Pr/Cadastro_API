package com.primeiroProject.demoparkapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;
@Getter @Setter @NoArgsConstructor
@Entity
@Table(name ="usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="userName", nullable = true, unique = true, length = 100)
    private String username;


    @Column(name="password", nullable  = true, length = 200)
    private String password;


    @Enumerated(EnumType.STRING)
    @Column(name="role",  length = 25)
    private Role role;


    @Column(name="data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "dataModificacao")
    private LocalDateTime dataModificacao;

    @Column(name="Criado_por")
    private String criadoPor;

    @Column(name="modificado_por")
    private String modificadoPor;



    public enum Role{
        ROLE_ADMIN, ROLE_CLIENTE

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                '}';
    }
}
