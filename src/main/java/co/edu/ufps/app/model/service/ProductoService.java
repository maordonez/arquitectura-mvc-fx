package co.edu.ufps.app.model.service;

import java.util.List;

import co.edu.ufps.app.config.exception.AppException;
import co.edu.ufps.app.model.entity.Producto;

public interface ProductoService {
	
	public List<Producto> listar();
	public void guardar(Producto producto) throws AppException;
	public void actualizar(Producto producto) throws AppException;
	
}
