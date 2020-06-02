package ru.vinylcoding;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainApp extends Application {

    RootController controller;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml")); 
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        scene.setFill(Color.SILVER);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        controller = (RootController)loader.getController();
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {controller.onKeyPressed(event);});
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
