package com.avaliacao03.avaliacao03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao03.avaliacao03.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
