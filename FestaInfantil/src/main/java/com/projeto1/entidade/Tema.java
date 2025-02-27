package com.projeto1.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="tema")
	public class Tema {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column (name="nome")
		private String nome;
		
		@Column (name="valorAluguel")
		private double valorAluguel;
		
		@Column (name="corToalha")
		private String corToalha;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getValorAluguel() {
			return valorAluguel;
		}

		public void setValorAluguel(double valorAluguel) {
			this.valorAluguel = valorAluguel;
		}

		public String getCorToalha() {
			return corToalha;
		}

		public void setCorToalha(String corToalha) {
			this.corToalha = corToalha;
		}
		
}

