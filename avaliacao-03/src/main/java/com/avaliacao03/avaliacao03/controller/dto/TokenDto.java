package com.avaliacao03.avaliacao03.controller.dto;

public class TokenDto {

	private String token;
	private String tipo;

	public TokenDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
	}

	public String getToken() {
		return token;
	}

	public String getString() {
		return tipo;
	}
}
