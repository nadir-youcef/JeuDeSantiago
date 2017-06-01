package application;
	
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(final Stage primaryStage) {
		
	    try {
	    	
	        // Localisation du fichier FXML
	        final URL url = getClass().getResource("Plateau.fxml");
	        
	        // Réalisation du loader
	        final FXMLLoader fxmlLoader = new FXMLLoader(url);
	        
	        // Chargement du fichier FXML
	        final AnchorPane root = (AnchorPane) fxmlLoader.load();
	        
	        // Réalisation de la scène
	        final Scene scene = new Scene(root, 795, 640);
	        primaryStage.setScene(scene);
	        
	      } catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	      }
	    
	    
	      primaryStage.setTitle("Jeu de Santiago");
	      primaryStage.show();
	      
	    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
