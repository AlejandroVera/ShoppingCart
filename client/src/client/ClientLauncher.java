package client;

import java.net.URL;

import client.gui.GlobalContainer;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ClientLauncher extends Application {

	private Stage primaryStage;
	public static GlobalContainer globalContainer;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Carro de la compra");
		
		//TODO: carga icono
		
		//TODO: cargar fuente
		
		this.primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

			@Override
			public void handle(WindowEvent event) {
				System.exit(0);
			}
		});
		
		//Cargamos el controlador
		FXMLLoader loader = new FXMLLoader();
		URL resource = getClass().getResource("gui/GlobalContainer.fxml");
		loader.setLocation(resource);
		Parent root = (Parent) loader.load(resource.openStream());
		
		globalContainer = loader.getController();
		
		//Mostramos la nueva vista
		Scene scene = new Scene(root, this.primaryStage.getWidth(), this.primaryStage.getHeight());
		this.primaryStage.setScene(scene);
		this.primaryStage.show();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
