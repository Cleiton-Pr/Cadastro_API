package com.primeiroProject.demoparkapi.service;

import com.primeiroProject.demoparkapi.entity.Usuario;
import com.primeiroProject.demoparkapi.repository.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;

  @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);


    }

    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id) {
      return usuarioRepositorio.findById(id).orElseThrow(
              () -> new RuntimeException("Usuario não encontrado")
      );
    }


    @Transactional
    public Usuario editarSenha(Long id, String password) {
        Usuario user = buscarPorId(id);
        user.setPassword(password);
        return user;
    }

    @Transactional(readOnly = true)
    public List<Usuario> buscarTodos(){
          return usuarioRepositorio.findAll();
        }


    }

