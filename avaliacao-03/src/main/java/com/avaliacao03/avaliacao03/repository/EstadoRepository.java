package com.avaliacao03.avaliacao03.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao03.avaliacao03.modelo.Estado;
import com.avaliacao03.avaliacao03.modelo.Regiao;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

	Page<Estado> findByRegiao(Regiao regiao, Pageable paginacao);
}
