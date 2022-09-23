package com.avaliacao03.avaliacao03.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.avaliacao03.avaliacao03.modelo.Usuario;

public class UsuariosDto {
	private long id;
	private String nome;
	private String email;
	private String senha;

	public UsuariosDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}

	public static List<UsuariosDto> converter(List<Usuario> usuarios) {
		List<UsuariosDto> usuariosDto = new ArrayList<>();
		for(int i = 0; i < usuarios.size(); i++) {
			usuariosDto.add(new UsuariosDto(usuarios.get(i)));
		}
		return usuariosDto;
	}		
}
