package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.config.StageManager;
import co.edu.ufps.app.view.FxmlView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Node[] nodes = new Node[20];
		
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = stageManager.getView(FxmlView.ITEM_PRODUCTOS);
			this.itemsList.getChildren().add(nodes[i]);
		}

	}
}
