package co.edu.ufps.app.controller;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

@Controller
public class ItemVentaController {

	@FXML
	private Label labelCodigo;
	
	@FXML
	private Label labelNombre;
	
	@FXML
	private Label labelCantidad;
	
	@FXML
	private Label labelTotal;
	
	@FXML
	private Button btnDelete;
	
	@FXML
	private HBox dashItem;
}
