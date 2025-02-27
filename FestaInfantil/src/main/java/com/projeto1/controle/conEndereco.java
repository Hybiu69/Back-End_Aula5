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

import com.projeto1.entidade.Endereco;
import com.projeto1.servico.servEndereco;

@RestController
@RequestMapping("/endereco")
public class conEndereco {
	
	private final servEndereco servEndereco;
	
	@Autowired
	public conEndereco(servEndereco servEndereco) {
		this.servEndereco=servEndereco;
	}
	
	@PostMapping
	public Endereco createEndereco(@RequestBody Endereco endereco) {
		return servEndereco.saveEndereco(endereco);
	}
	@GetMapping("/{id}")
	public Endereco getEndereco(@PathVariable Long id) {
		return servEndereco.getEnderecoById(id);
	}
	@GetMapping
	public List<Endereco>getAllEndereco(){
		return servEndereco.getAllEndereco();
	}
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		servEndereco.deleteEndereco(id);
	}	

}
