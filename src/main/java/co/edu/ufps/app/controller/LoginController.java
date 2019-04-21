package co.edu.ufps.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.config.StageManager;
import co.edu.ufps.app.model.entity.Rol;
import co.edu.ufps.app.model.service.AuthService;
import co.edu.ufps.app.view.FxmlView;

@Slf4j
@Controller
public class LoginController implements Initializable {

	@FXML
	private Button btnLogin;

	@Getter
	@FXML
	private PasswordField password;

	@Getter
	@FXML
	private TextField username;
	
	@FXML //  fx:id="fruitCombo"
	private ComboBox<String> fruitCombo;
	

	@FXML
	private Label lblLogin;

	@Lazy
	@Autowired
	private StageManager stageManager;
	
	@Autowired
	private AuthService authService;

	@FXML
	private void login(ActionEvent event) throws IOException {
		
		String usernameText  = username.getText();
		String passwordText  = password.getText();
		String rol = fruitCombo.getValue();
		
		if(usernameText.isEmpty() || passwordText.isEmpty() || rol == null ) {
			lblLogin.setText("Diligencie todos lo campos.");
			return;
		}
		
		if(authService.autentifcar(usernameText, passwordText, rol)) {
			
			if(Rol.Administrador.name().equals(rol)) {
				
				stageManager.switchScene(FxmlView.DASHBOARD_ADMINISTRADOR);
				
			}else {
				stageManager.switchScene(FxmlView.DASHBOARD_CAJERO);
			}
			
			
			
		}else {
			
			lblLogin.setText("Credenciales incorrectas");
		}
		
		
	}
	
	
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	password.setText("cajeropass");
    	username.setText("1040520180");
		fruitCombo.getItems().addAll(authService.listarRoles());
		fruitCombo.setValue("Cajero");
	}

}
