package com.avaliacao03.avaliacao03.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao03.avaliacao03.controller.dto.EstadosDto;
import com.avaliacao03.avaliacao03.modelo.Estado;
import com.avaliacao03.avaliacao03.repository.EstadoRepository;

@RestController
@RequestMapping(value = "/api/v1/estados")
public class EstadosController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<EstadosDto> listar(@RequestParam(required = false) String filtroRegiao){
		if(filtroRegiao == null) {
			List<Estado> estados = estadoRepository.findAll();
			return EstadosDto.converter(estados);
		}else {
			List<Estado> estados = estadoRepository.findByRegiao(filtroRegiao);
			return EstadosDto.converter(estados);
		}		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EstadosDto> detalhar(@PathVariable Long id) {
		Optional<Estado> estado = estadoRepository.findById(id);
		if(estado.isPresent()){
			return ResponseEntity.ok(new EstadosDto(estado.get()));
		}
		
		return ResponseEntity.notFound().build();
	} 
	
	@PostMapping
	@Transactional
	public ResponseEntity<EstadosDto> cadastrar() {			
		return null;
	}
	
	@PutMapping
	@Transactional
	public ResponseEntity<EstadosDto> atualizar() {			
		return null;
	}
	
	@DeleteMapping
	@Transactional
	public ResponseEntity<EstadosDto> deletar() {			
		return null;
	}
	
	
}
