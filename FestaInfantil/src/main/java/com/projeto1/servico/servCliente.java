package com.projeto1.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto1.entidade.Cliente;
import com.projeto1.repositorio.repCliente;

@Service

public class servCliente {
	private final repCliente repCliente;

	@Autowired
	public servCliente(final repCliente repCliente) {
		this.repCliente=repCliente;
	}

	public Cliente saveCliente (final Cliente cliente) {
		return repCliente.save(cliente);
	}

	public Cliente getClienteById(final Long id) {
		return repCliente.findById(id).orElse(null);
	}
	public List<Cliente>getAllCliente(){
		return repCliente.findAll();
	}

	public void deleteCliente (final Long id) {
		repCliente.deleteById(id);
	}

}
