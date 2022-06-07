package com.diefenthaeler.jsp.demo.repository;

import com.diefenthaeler.jsp.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
