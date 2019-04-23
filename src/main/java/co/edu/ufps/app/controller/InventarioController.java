package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.config.StageManager;
import co.edu.ufps.app.model.entity.Producto;
import co.edu.ufps.app.model.service.ProductoService;
import co.edu.ufps.app.view.FxmlView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class InventarioController implements Initializable {

	@FXML
	private AnchorPane dashInventario;

	@FXML
	private HBox tablaProductos;

	@FXML
	private VBox itemsList = null;

	@Lazy
	@Autowired
	private StageManager stageManager;
	
	@Autowired
	private ProductoService productoService;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<Producto> productos=productoService.listar();
		
		
		
		for (Producto producto : productos) {
			log.info(producto.toString());
			this.itemsList.getChildren().add(stageManager.getView(FxmlView.ITEM_PRODUCTOS,producto));
		}
		
	}
}
