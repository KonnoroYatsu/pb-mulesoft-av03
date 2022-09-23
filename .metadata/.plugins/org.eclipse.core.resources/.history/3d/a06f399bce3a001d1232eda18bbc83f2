package com.avaliacao03.avaliacao03.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.avaliacao03.avaliacao03.modelo.Usuario;

public class UsuariosDto {
	private long id;
	private String nome;
	private String email;

	public UsuariosDto(long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
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

	public static List<UsuariosDto> converter(List<Usuario> usuarios) {
		//Fiz assim só pra entender melhor o funcionamento, ainda não fiz o curso de Collections :)
		List<UsuariosDto> usuariosDto = new ArrayList<>();
		for(int i = 0; i < usuarios.size(); i++) {
			usuariosDto.add(
					new UsuariosDto(
							usuarios.get(i).getId(),
							usuarios.get(i).getNome(),
							usuarios.get(i).getEmail()
							)
					);
		}
		return usuariosDto;
	}		
}
