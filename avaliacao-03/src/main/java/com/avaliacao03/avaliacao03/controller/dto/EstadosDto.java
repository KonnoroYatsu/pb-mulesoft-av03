package com.avaliacao03.avaliacao03.controller.dto;

import org.springframework.data.domain.Page;

import com.avaliacao03.avaliacao03.modelo.Estado;
import com.avaliacao03.avaliacao03.modelo.Regiao;

public class EstadosDto {
	private Long id;
	private String nome;
	private Regiao regiao;
	private Long populacao;
	private String capital;
	private Double area;
	
	public EstadosDto(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Regiao getRegiao() {
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

	public static Page<EstadosDto> converter(Page<Estado> estados) {
		return estados.map(EstadosDto::new);
	}	
}
