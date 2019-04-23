package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

import co.edu.ufps.app.model.entity.Producto;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
	
	
	Producto producto;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		labelCodigo.setText(""+producto.getIdProducto());
		labelNombre.setText(producto.getNombre());
		labelProveedor.setText(producto.getProveedor());
		labelCategoria.setText(producto.getCategoria().name());
		labelPU.setText(producto.getPrecioUnidad()+"");
		labelStock.setText(producto.getCantidadExistente()+"");
		
	}
	
	public void setData(Producto producto) {
		this.producto=producto;
	}

}
