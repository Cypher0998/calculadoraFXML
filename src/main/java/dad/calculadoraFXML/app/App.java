package dad.calculadoraFXML.app;

import dad.calculadoraFXML.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	private Controller controlador;
	public void start(Stage primaryStage)throws Exception{
		controlador= new Controller();
		Scene escena= new Scene(controlador.getView());
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
