package co.edu.ufps.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.app.entity.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

}
