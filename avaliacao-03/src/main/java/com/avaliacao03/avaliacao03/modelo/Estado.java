package com.avaliacao03.avaliacao03.modelo;

public class Estado {
	private Long id;
	private String nome;
	private String regiao;
	private Double populacao;
	private String capital;
	private Double area;
	
	public Long getId() {
		return id;
	}
	public void setId(long i) {
		this.id = i;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public double getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Double i) {
		this.populacao = i;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(double d) {
		this.area = d;
	}
}
