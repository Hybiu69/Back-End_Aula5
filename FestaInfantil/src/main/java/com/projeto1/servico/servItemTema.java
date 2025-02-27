package com.projeto1.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto1.entidade.ItemTema;
import com.projeto1.repositorio.repItemTema;

@Service
public class servItemTema {
	private final repItemTema repItemTema;
	
	@Autowired
	public servItemTema (repItemTema repItemTema) {
		this.repItemTema=repItemTema;
	}
	public ItemTema saveItemTema(ItemTema ItemTema) {
		return repItemTema.save(ItemTema);
	}
	public ItemTema getItemTemaById(Long id) {
		return repItemTema.findById(id).orElse(null);
	}
	public List<ItemTema>getAllItemTema(){
		return repItemTema.findAll();
	}
	public void deleteItemTema(Long id) {
		repItemTema.deleteById(id);
	}
}
