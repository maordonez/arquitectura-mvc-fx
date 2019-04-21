package co.edu.ufps.app.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ufps.app.config.exception.AppException;
import co.edu.ufps.app.model.dao.ProductoRepository;
import co.edu.ufps.app.model.entity.Producto;
import co.edu.ufps.app.model.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;

	@Transactional(readOnly=true)
	@Override
	public List<Producto> listar() {
		return productoRepository.findAll();
	}

	@Transactional
	@Override
	public void guardar(Producto producto) throws AppException{
		Optional<Producto> opt = productoRepository.findFirstByNombre(producto.getNombre());
		
		if(opt.isPresent()) {
			throw new AppException("El producto " + producto.getNombre()+ " ya existe");
		}
		
		productoRepository.save(producto);
		
	}
	
	@Transactional(rollbackFor = AppException.class)
	@Override
	public void actualizar(Producto producto) throws AppException {
		if(!productoRepository.existsById(producto.getIdProducto())) {
			throw new AppException("El producto "+producto.getNombre()+" no existe");
		}
		productoRepository.save(producto);
	}

}
