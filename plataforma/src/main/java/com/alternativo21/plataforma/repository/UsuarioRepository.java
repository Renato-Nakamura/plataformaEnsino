package com.alternativo21.plataforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alternativo21.plataforma.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
