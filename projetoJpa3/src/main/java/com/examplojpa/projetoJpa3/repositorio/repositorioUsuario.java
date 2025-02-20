package com.examplojpa.projetoJpa3.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;

import com.examplojpa.projetoJpa3.entidades.Usuario;

public interface repositorioUsuario  extends JpaRepository<Usuario, Long>{

}
