package co.edu.ufps.app.config;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import co.edu.ufps.app.controller.ItemProductoController;
import co.edu.ufps.app.model.entity.Producto;

@Component
public class SpringFXMLLoader {
	
	private final ResourceBundle resourceBundle;
    private final ApplicationContext context;

    @Autowired
    public SpringFXMLLoader(ApplicationContext context, ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
        this.context = context;
    }

    public Parent load(String fxmlPath) throws IOException {      
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(context::getBean); //Spring now FXML Controller Factory
        loader.setResources(resourceBundle);
        loader.setLocation(getClass().getResource(fxmlPath));
        return loader.load();
    }
    
    public Parent load(String fxmlPath, Object obj) throws IOException {      
        FXMLLoader loader = new FXMLLoader();
        ItemProductoController itemProductoController=new ItemProductoController();
        itemProductoController.setData((Producto) obj);
        loader.setController(itemProductoController);
        loader.setResources(resourceBundle);
        loader.setLocation(getClass().getResource(fxmlPath));
        return loader.load();
    }

}
