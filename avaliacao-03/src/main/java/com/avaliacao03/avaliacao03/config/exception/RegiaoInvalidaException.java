package com.avaliacao03.avaliacao03.config.exception;

public class RegiaoInvalidaException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public RegiaoInvalidaException(String regiao) {
		super("O valor '" + regiao + "' para o campo regiao não é válido. O valor deve ser: Norte, Nordeste, Sul, Sudeste ou Centro_Oeste");
	}	
}
