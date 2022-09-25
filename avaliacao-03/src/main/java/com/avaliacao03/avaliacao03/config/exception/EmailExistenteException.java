package com.avaliacao03.avaliacao03.config.exception;

public class EmailExistenteException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public EmailExistenteException() {
		super("O email já existe na base de dados");
	}	
}
