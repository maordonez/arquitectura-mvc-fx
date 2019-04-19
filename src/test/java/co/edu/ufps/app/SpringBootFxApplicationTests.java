package co.edu.ufps.app;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.edu.ufps.app.entity.Categoria;
import co.edu.ufps.app.entity.Producto;
import co.edu.ufps.app.entity.Rol;
import co.edu.ufps.app.entity.Usuario;
import co.edu.ufps.app.repository.ProductoRepository;
import co.edu.ufps.app.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFxApplicationTests {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ProductoRepository productoRepository;

	
	@Test
	public void usuarioFindById() {
		Optional<Usuario> optional = usuarioRepository.findById(1l);
		Usuario usuario = new Usuario(1l, "89340935", "Miguel Angel", "Ordoñez Gayon", "1234", Rol.Cajero);
		
		assertEquals(optional, Optional.of(usuario));
		
	}
	
	@Test
	public void productoFindById() {
		Optional<Producto> optional = productoRepository.findById(1l);
		Producto producto = new Producto(1l, "Pepsi", "Juanito Perez", Categoria.Bebidas, 1000, 40);
		
		assertEquals(optional, Optional.of(producto));
	}

}
