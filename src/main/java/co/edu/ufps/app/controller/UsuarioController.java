package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.model.entity.Usuario;
import co.edu.ufps.app.model.service.AuthService;
import co.edu.ufps.app.model.service.ProductoService;
import co.edu.ufps.app.util.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

@Controller
public class UsuarioController implements Initializable {
	@FXML
	private AnchorPane dashUsuario;

	@FXML
	private Label labelNombre;
	@FXML
	private Label labelCedula;
	@FXML
	private Label labelApellido;
	@FXML
	private Label labelClave;

	@FXML
	private Button btnEditar;
	
	@Autowired
	private AuthService authService;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Usuario usuario=authService.findOne(User.getId());
		
		labelNombre.setText(usuario.getNombre());
		labelApellido.setText(usuario.getApellido());
		labelCedula.setText(User.getId());
		labelClave.setText("*********");
		
	}

}
