package co.edu.ufps.app.model.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import co.edu.ufps.app.model.dao.UsuarioRepository;
import co.edu.ufps.app.model.entity.Rol;
import co.edu.ufps.app.model.entity.Usuario;
import co.edu.ufps.app.model.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public boolean autentifcar(String cedula, String password, String rol) {
		Optional<Usuario> opt = usuarioRepository.findByCedula(cedula);
		if(opt.isPresent()) {
			Usuario usuario = opt.get();
			String encode = DigestUtils.md5DigestAsHex(password.getBytes());
			
			if(encode.equals(usuario.getPassword()) && usuario.getRol().name().equals(rol)) {
				return true;
			}
		
		}
		return false;
	}

	@Override
	public List<String> listarRoles() {
		return Arrays.asList(Rol.values())
				.stream()
				.map(Rol::name)
				.collect(Collectors.toList());
	}

}
