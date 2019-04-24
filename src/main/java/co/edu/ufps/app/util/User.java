package co.edu.ufps.app.util;

public class User {
	private static String cedula;
	
	public static void setId(String ide) {
		cedula=ide;
	}
	public static String getId() {
		return cedula;
	}
}
