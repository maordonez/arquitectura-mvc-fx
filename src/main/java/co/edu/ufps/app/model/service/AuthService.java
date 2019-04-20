package co.edu.ufps.app.model.service;

import java.util.List;


public interface AuthService {
	
	public boolean autentifcar(String cedula, String password, String rol);
	public List<String> listarRoles();
	
}
