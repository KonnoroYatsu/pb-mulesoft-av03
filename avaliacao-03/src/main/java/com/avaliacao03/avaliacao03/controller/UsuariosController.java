package com.avaliacao03.avaliacao03.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao03.avaliacao03.controller.dto.UsuariosDto;
import com.avaliacao03.avaliacao03.modelo.Usuario;

@RestController
public class UsuariosController {
	
	@ResponseBody
	@RequestMapping(value = "/usuarios")
	public List<UsuariosDto> listar(){
		Usuario usuario = new Usuario();
		
		usuario.setId(1);
		usuario.setNome("João Murilo Daniel");
		usuario.setEmail("joao_teste@live.com");
		usuario.setSenha("SenhaTeste123");
		
		return UsuariosDto.converter(Arrays.asList(usuario, usuario, usuario));
	}	
}
