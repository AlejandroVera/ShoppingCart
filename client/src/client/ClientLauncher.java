package client;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ClientLauncher extends Application {

	private Stage primaryStage;
	
	
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

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
