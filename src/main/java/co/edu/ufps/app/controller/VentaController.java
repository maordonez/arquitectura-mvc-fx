package co.edu.ufps.app.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.config.StageManager;
import co.edu.ufps.app.view.FxmlView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@Controller
public class VentaController implements Initializable {

	@FXML
	private AnchorPane dashVentas;

	@FXML
	private Button btnAgregarProducto;

	@FXML
	private Button btnBuscarCliente;

	@FXML
	private Label labelNombreCli;

	@FXML
	private Label labelCodigoCli;

	@FXML
	private Label labelNombreEmpleado;

	@FXML
	private TextField txtCedulaCliente;

	@FXML
	private HBox tablaVentas;

	@FXML
	private VBox itemsList;

	@Lazy
	@Autowired
	private StageManager stageManager;

	private ArrayList<Object> myListProductos = new ArrayList<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Node[] nodes = new Node[20];
		for (int i = 0; i < nodes.length; i++) {

			nodes[i] = stageManager.getView(FxmlView.ITEM_VENTAS);
			this.itemsList.getChildren().add(nodes[i]);

		}

	}

	public void agregarNuevoProducto(ActionEvent actionEvent) {
		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FxmlView.ITEM_VENTAS.getFxmlFile()));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (Exception e) {
			System.out.println("Me quede en agregar nuevo");
		}
	}

}
