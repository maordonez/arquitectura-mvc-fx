package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
