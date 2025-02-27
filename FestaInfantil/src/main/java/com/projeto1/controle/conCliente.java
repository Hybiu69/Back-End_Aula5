package com.projeto1.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto1.entidade.Cliente;
import com.projeto1.servico.servCliente;

@RestController
@RequestMapping("/clientes")

public class conCliente {
	
private final servCliente servCliente;
	
	@Autowired
	
	public conCliente(servCliente servCliente) {
		this.servCliente=servCliente;
	}
	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return servCliente.saveCliente(cliente);
	}
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return servCliente.getClienteById(id);
	}
	@GetMapping
	public List<Cliente>getAllCliente(){
		return servCliente.getAllCliente();
	}
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		servCliente.deleteCliente(id);
	}	

}
