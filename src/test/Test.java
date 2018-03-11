package test;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Test extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/test/table.fxml"));
		
		Parent parent = loader.load();
		
		TestController ctr = loader.getController();
		
		
		ctr.getItems().add(new Person("Your Name"));
				
		Scene Sceen = new Scene(parent, Color.TRANSPARENT);

						 		
		primaryStage.setScene(Sceen);
		
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
