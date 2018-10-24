package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	    Parent root = loader.load();
	    MenuBar menuBar = (MenuBar)loader.getNamespace().get("menuBar");
	    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 650, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
