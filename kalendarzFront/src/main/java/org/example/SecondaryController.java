package org.example;

// ---- JAVAFX
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

// ---- JAVA
import java.io.IOException;

public class SecondaryController{

    // ---- OBJECTS
    public Button sendButton;

    // ---- JAVA

    // ---- FXML
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    public TextField toBox = new TextField();
    @FXML
    public TextField topicBox = new TextField();
    @FXML
    public TextArea insideType = new TextArea();

    // ---- METHODS




}