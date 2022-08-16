package com.blogpessoal.repository;

public class UsuarioRepository {
	import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.model.usuario.Usuario;

	@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
		public Optional<Usuario> findByUsuario(String usuario);
	}
}
