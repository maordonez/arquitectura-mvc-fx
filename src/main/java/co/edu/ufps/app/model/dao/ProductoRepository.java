package co.edu.ufps.app.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.app.model.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	public Optional<Producto> findFirstByNombre(String nombre);
}
