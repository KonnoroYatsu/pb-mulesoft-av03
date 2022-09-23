package com.avaliacao03.avaliacao03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao03.avaliacao03.modelo.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

	List<Estado> findByRegiao(String filtroEstado);
}
