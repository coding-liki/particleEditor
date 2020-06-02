package ru.vinylcoding;

import java.io.File;
import java.util.Vector;

import javafx.fxml.FXML;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class RootController {
    
    @FXML
    MenuItem closeMenuBtn;
    
    @FXML
    AnchorPane root;
    
    @FXML
    VBox leftVbox;
    
    @FXML
    PerspectiveCamera $camera;

    @FXML
    Group group3D;
    FileChooser fileChooser;
    
    Vector<Particle> particles = new Vector<Particle>();
    @FXML
    public void closeApp() {
        Stage stage = (Stage)root.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    public void openImportDialog() {
        fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(root.getScene().getWindow());
        Label newLabel = new Label();
        newLabel.setText(file.getName());
        leftVbox.getChildren().add(newLabel);
    }

    @FXML
    public void addParticle(){
        Particle newParticle = new Particle();
        particles.add(newParticle);
        newParticle.addToGroup(group3D);
    }

    public void onKeyPressed(KeyEvent event) {
        System.out.println("Key pressed " + event.getCode());
        for (Particle particle : particles) {
            particle.rotate(new Point3D(0, 1, 0), 10);
        }
    }


    public void initialize() {
        System.out.println("Initializing");
        // root.getScene().getWindow().addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {onKeyPressed(event);});
    }    
}
