package br.com.fiap.checkpoint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.checkpoint1.model.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}