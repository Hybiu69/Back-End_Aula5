package com.examplojpa.projetoJpa3.controle;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplojpa.projetoJpa3.entidades.Usuario;
import com.examplojpa.projetoJpa3.servico.servicoUsuario;

@RestController
@RequestMapping("/usuarios")

public class controleUsuario {
    
	private final servicoUsuario servicoUsuario;

    @Autowired
    public controleUsuario(servicoUsuario servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return servicoUsuario.saveUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        return servicoUsuario.getUsuarioById(id);
    }

    @GetMapping
    public List<Usuario> getAllUsuario() {
        return servicoUsuario.getAllUsuario();
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        servicoUsuario.deleteUsuario(id);
    }
}

