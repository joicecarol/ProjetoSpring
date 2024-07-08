package com.aula.spring.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.spring.springboot.entities.Usuario;
import com.aula.spring.springboot.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public List<Usuario> procuraTodos(){
		return service.procuraTodos();
		
	}
	
	@GetMapping(value = "/{id}")
	public Usuario procuraPorId ( @PathVariable Integer id ) {
		return service.procuraPorId(id);
		
		
	}
	
	@PostMapping
	public String adicionarUsuario(@RequestBody Usuario usuario) {
		
		String response = service.adicionarUsuario(usuario);
		return response;
		
	}
	
	@PutMapping(value = "/{id}")
	public String editarUsuario( @PathVariable Integer id, @RequestBody Usuario usuario) {
		
		String response = service.editarUsuario(id, usuario);
				return response;
		
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluirUsuario( @PathVariable Integer id) {
		service.excluirUsuario(id);
		
	}
	

}
