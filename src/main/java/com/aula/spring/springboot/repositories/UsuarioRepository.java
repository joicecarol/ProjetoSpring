package com.aula.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.spring.springboot.entities.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository< Usuario, Integer> {
	
	
	

}
