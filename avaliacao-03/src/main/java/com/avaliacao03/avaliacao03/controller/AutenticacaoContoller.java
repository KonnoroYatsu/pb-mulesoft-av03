package com.avaliacao03.avaliacao03.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao03.avaliacao03.config.security.TokenService;
import com.avaliacao03.avaliacao03.controller.dto.TokenDto;
import com.avaliacao03.avaliacao03.controller.form.LoginForm;

@RestController
@CrossOrigin()
@RequestMapping("/api/v1/autenticacao")
public class AutenticacaoContoller {

	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<TokenDto> autenticar(
			@RequestBody @Valid LoginForm loginForm){
		UsernamePasswordAuthenticationToken dadosLogin = loginForm.converter();
		try {
			Authentication authenticacao = authManager.authenticate(dadosLogin);
			String token = tokenService.gerarToken(authenticacao);
			return ResponseEntity.ok(new TokenDto(token, "Bearer"));
		}catch (AuthenticationException e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
