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

import com.projeto1.entidade.ItemTema;
import com.projeto1.servico.servItemTema;

@RestController
@RequestMapping("/itemtema")
public class conItemTema {

private final servItemTema servItemTema;
	
	@Autowired
	
	public conItemTema(servItemTema servItemTema) {
		this.servItemTema=servItemTema;
	}
	
	@PostMapping
	public ItemTema createItemTema(@RequestBody ItemTema itemTema) {
		return servItemTema.saveItemTema(itemTema);
	}
	@GetMapping("/{id}")
	public ItemTema getItemTema(@PathVariable Long id) {
		return servItemTema.getItemTemaById(id);
	}
	@GetMapping
	public List<ItemTema>getAllItemTema(){
		return servItemTema.getAllItemTema();
	}
	@DeleteMapping("/{id}")
	public void deleteItemTema(@PathVariable Long id) {
		servItemTema.deleteItemTema(id);
	}	
	
}
