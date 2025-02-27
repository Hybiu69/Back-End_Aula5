package com.projeto1.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto1.entidade.Endereco;
import com.projeto1.repositorio.repEndereco;

@Service
public class servEndereco {
	private final repEndereco repEndereco;

	@Autowired
	public servEndereco(final repEndereco repEndereco) {
		this.repEndereco=repEndereco;
	}

	public Endereco saveEndereco(final Endereco endereco) {
		return repEndereco.save(endereco);
	}

	public Endereco getEnderecoById(final Long id) {
		return repEndereco.findById(id).orElse(null);
	}
	public List<Endereco>getAllEndereco(){
		return repEndereco.findAll();
	}

	public void deleteEndereco (final Long id) {
		repEndereco.deleteById(id);
	}
	
}
