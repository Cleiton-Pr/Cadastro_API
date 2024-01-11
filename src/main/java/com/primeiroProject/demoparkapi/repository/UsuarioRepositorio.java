package com.primeiroProject.demoparkapi.repository;

import com.primeiroProject.demoparkapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
