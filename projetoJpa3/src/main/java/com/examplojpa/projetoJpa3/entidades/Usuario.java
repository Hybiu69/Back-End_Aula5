package com.examplojpa.projetoJpa3.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 	
@Table(name = "usuario")

public class Usuario {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		 
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "permissao")
		private String permissao;
	
		@Column(name = "password")
		private int password;
		
		@Column(name = "usuario")
		private String usuario;

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

		public String getPermissao() {
			return permissao;
		}

		public void setPermissao(String permissao) {
			this.permissao = permissao;
		}

		public int getPassword() {
			return password;
		}

		public void setPassword(int password) {
			this.password = password;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}


}
