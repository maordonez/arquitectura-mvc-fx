package co.edu.ufps.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.Getter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import co.edu.ufps.app.config.StageManager;

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

	@FXML
	private Label lblLogin;

	@Lazy
	@Autowired
	private StageManager stageManager;

	@FXML
	private void login(ActionEvent event) throws IOException {
		lblLogin.setText("Login Failed.");
	}
	
	
	
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
