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
import co.edu.ufps.app.model.service.AuthService;

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
		
		if(usernameText.isEmpty() || passwordText.isEmpty()) {
			lblLogin.setText("Diligencie todos lo campos.");
			return;
		}
		
		lblLogin.setText("Login Failed.");
	}
	
	
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		fruitCombo.getItems().addAll(authService.listarRoles());
	}

}
