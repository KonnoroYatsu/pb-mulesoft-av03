package com.avaliacao03.avaliacao03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao03.avaliacao03.controller.dto.UsuariosDto;
import com.avaliacao03.avaliacao03.modelo.Usuario;
import com.avaliacao03.avaliacao03.repository.UsuarioRepository;

@RestController
public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@ResponseBody
	@RequestMapping(value = "/usuarios")
	public List<UsuariosDto> listar(){
		List<Usuario> usuarios = usuarioRepository.findAll();	
		return UsuariosDto.converter(usuarios);
	}	
}
