package co.edu.ufps.app.view;

import java.util.ResourceBundle;

public enum FxmlView {

	LOGIN {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("login.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/login.fxml";
		}
	},
	DASHBOARD_CAJERO {

		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/dashboard_cajero.fxml";
		}

	},
	DASHBOARD_ADMINISTRADOR {

		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/dashboard_administrador.fxml";
		}

	},
	
	CAJERO_VENTAS{
		
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/cajero_ventas.fxml";
		}
		
	},
	CAJERO_INVENTARIO {

		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/cajero_inventario.fxml";
		}

	},
	USUARIO_SISTEM {
		
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/usuario_sistem.fxml";
		}
		
	},
	ITEM_PRODUCTOS {

		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/item_productos.fxml";
		}

	},
	ITEM_VENTAS {
		
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("inventario.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/item_ventas.fxml";
		}
		
	};

	public abstract String getTitle();

	public abstract String getFxmlFile();

	String getStringFromResourceBundle(String key) {
		return ResourceBundle.getBundle("Bundle").getString(key);
	}

}
