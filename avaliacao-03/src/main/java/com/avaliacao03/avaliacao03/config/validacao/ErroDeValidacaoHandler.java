package com.avaliacao03.avaliacao03.config.validacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.avaliacao03.avaliacao03.config.exception.EmailExistenteException;
import com.avaliacao03.avaliacao03.config.exception.RegiaoInvalidaException;

@RestControllerAdvice
public class ErroDeValidacaoHandler {

	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<String> handler(MethodArgumentNotValidException exception){
		List<String> erros = new ArrayList<String>();
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		for(int i = 0; i < fieldErrors.size(); i++) {
			String str = "Error - '" + fieldErrors.get(i).getField() + "' ";
			str += messageSource.getMessage(fieldErrors.get(i), LocaleContextHolder.getLocale());
			erros.add(str);
		}
		return erros;
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(RegiaoInvalidaException.class)
	public List<String> handler(RegiaoInvalidaException exception) {
		List<String> erro = new ArrayList<String>();
		erro.add(exception.getMessage());
		return erro;
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmailExistenteException.class)
	public List<String> handler(EmailExistenteException exception) {
		List<String> erro = new ArrayList<String>();
		erro.add(exception.getMessage());
		return erro;
	}
}	
