package com.projeto1.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto1.entidade.Tema;
import com.projeto1.repositorio.repTema;

@Service
public class servTema {
private final repTema repTema;
	
	@Autowired
	public servTema(repTema repTema) {
		this.repTema=repTema;
	}
	
	public Tema saveTema(Tema tema) {
		return repTema.save(tema);
	}
	
	public Tema getTemaById(Long id) {
		return repTema.findById(id).orElse(null);
	}
	
	public List<Tema>getAllTema(){
		return repTema.findAll();
	}
	
	public void deleteTema(Long id) {
		repTema.deleteById(id);
	}

}
