package co.edu.ufps.app.config.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AppException  extends RuntimeException{
	
	@Getter
	private String message;
	
	
	
}
