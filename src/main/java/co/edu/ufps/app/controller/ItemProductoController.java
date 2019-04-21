package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

@Controller
public class ItemProductoController implements Initializable {

	@FXML
	private HBox dashItem;
	
	@FXML
	private Label labelCodigo;
	@FXML
	private Label labelNombre;
	@FXML
	private Label labelProveedor;
	@FXML
	private Label labelCategoria;
	@FXML
	private Label labelPU;
	@FXML
	private Label labelStock;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
