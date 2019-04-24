package co.edu.ufps.app.model.service;

import java.util.List;

import co.edu.ufps.app.model.entity.Usuario;


public interface AuthService {
	
	public boolean autentifcar(String cedula, String password, String rol);
	public List<String> listarRoles();
	public Usuario findOne(String cedula);
	
}
