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

import com.projeto1.entidade.Tema;
import com.projeto1.servico.servTema;

@RestController
@RequestMapping("/tema")

public class conTema {
	
private final servTema servTema;
	
	@Autowired
	
	public conTema(servTema servTema) {
		this.servTema=servTema;
	}
	
	@PostMapping
	public Tema createTema(@RequestBody Tema tema) {
		return servTema.saveTema(tema);
	}
	@GetMapping("/{id}")
	public Tema getTema(@PathVariable Long id) {
		return servTema.getTemaById(id);
	}
	@GetMapping
	public List<Tema>getAllTema(){
		return servTema.getAllTema();
	}
	@DeleteMapping("/{id}")
	public void deleteTema(@PathVariable Long id) {
		servTema.deleteTema(id);
	}	

}
