package com.examplojpa.projetoJpa3.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplojpa.projetoJpa3.entidades.Usuario;
import com.examplojpa.projetoJpa3.repositorio.repositorioUsuario;

@Service
public class servicoUsuario {
    private final repositorioUsuario repositorioUsuario;

    //construtor que recebe a dependencia
    @Autowired
    public servicoUsuario(repositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario saveUsuario (Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public Usuario getUsuarioById(Long id) {
        return repositorioUsuario.findById(id).orElse(null);
    }

    public List<Usuario> getAllUsuario () {
        return repositorioUsuario.findAll();
    }

    public void deleteUsuario (Long id) {
        repositorioUsuario.deleteById(id);
    }
}
