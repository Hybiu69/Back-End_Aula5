package com.projeto1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.entidade.Cliente;

public interface repCliente extends JpaRepository <Cliente,Long> {

}
