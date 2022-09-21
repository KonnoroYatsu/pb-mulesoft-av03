package com.avaliacao03.avaliacao03.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.avaliacao03.avaliacao03.modelo.Estado;

public class EstadosDto {
	private Long id;
	private String nome;
	private String regiao;
	private Long populacao;
	private String capital;
	private Double area;
	
	public EstadosDto(Long id, String nome, String regiao, Long populacao, String capital, Double area) {
		this.id = id;
		this.nome = nome;
		this.regiao = regiao;
		this.populacao = populacao;
		this.capital = capital;
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public Long getPopulacao() {
		return populacao;
	}

	public String getCapital() {
		return capital;
	}

	public Double getArea() {
		return area;
	}

	public static List<EstadosDto> converter(List<Estado> estados) {
		//Fiz assim só pra entender melhor o funcionamento, ainda não fiz o curso de Collections :)
		List<EstadosDto> estadosDto = new ArrayList<>();
		for(int i = 0; i < estados.size(); i++) {
			estadosDto.add(
					new EstadosDto(
							estados.get(i).getId(),
							estados.get(i).getNome(),
							estados.get(i).getRegiao(),
							estados.get(i).getPopulacao(),
							estados.get(i).getCapital(),
							estados.get(i).getArea()
							)
					);
		}
		return estadosDto;
	}	
}
