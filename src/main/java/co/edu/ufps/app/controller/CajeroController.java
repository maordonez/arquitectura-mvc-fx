package co.edu.ufps.app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.config.StageManager;
import co.edu.ufps.app.view.FxmlView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

@Controller
public class CajeroController implements Initializable {

	@FXML
	private AnchorPane dashContent;

	@FXML
	private Button btnInventario;

	@FXML
	private Button btnVentas;

	@FXML
	private Button btnUsuario;

	@FXML
	private AnchorPane dashIndex;

	@FXML
	private VBox menu;

	@Lazy
	@Autowired
	private StageManager stageManager;

	public void handleClicks(ActionEvent actionEvent) {

		if (actionEvent.getSource() == this.btnInventario) {
			setParent(stageManager.getView(FxmlView.CAJERO_INVENTARIO));

		}
		if (actionEvent.getSource() == this.btnVentas) {
			setParent(stageManager.getView(FxmlView.CAJERO_VENTAS));

		}

		if (actionEvent.getSource() == this.btnUsuario) {
			setParent(stageManager.getView(FxmlView.USUARIO_SISTEM));
		}

	}

	private void setParent(Parent parent) {
		
		dashContent.getChildren().clear();
		dashContent.getChildren().add(parent);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		setParent(stageManager.getView(FxmlView.CAJERO_INVENTARIO));

	}

}
