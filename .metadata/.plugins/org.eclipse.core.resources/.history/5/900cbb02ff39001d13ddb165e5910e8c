package com.avaliacao03.avaliacao03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avaliacao03.avaliacao03.controller.dto.EstadosDto;
import com.avaliacao03.avaliacao03.modelo.Estado;
import com.avaliacao03.avaliacao03.repository.EstadoRepository;

@Controller
public class EstadosController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@ResponseBody
	@RequestMapping(value = "/estados")
	public List<EstadosDto> listar(){
		List<Estado> estados = estadoRepository.findAll();
		return EstadosDto.converter(estados);
	}
}
