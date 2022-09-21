package com.avaliacao03.avaliacao03.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avaliacao03.avaliacao03.modelo.Estado;

@Controller
public class EstadosController {
	
	@ResponseBody
	@RequestMapping(value = "/estados")
	public List<Estado> listar(){
		Estado estado = new Estado();
		
		estado.setId(1);
		estado.setNome("São Paulo");
		estado.setRegiao("Sudeste");
		estado.setPopulacao((double) 44000000);
		estado.setArea(248.209);
		estado.setCapital("São Paulo");
		
		return Arrays.asList(estado, estado, estado);
	}
}
