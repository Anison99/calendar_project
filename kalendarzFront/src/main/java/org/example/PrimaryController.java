package org.example;
//-------- JAVA

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import pcalendar.Date;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class PrimaryController implements Initializable {
    // ---- OBJECTS
    public Label dateLabel2;

    // ---- JAVA


    // ---- FXML
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private ChoiceBox<String> stringChoiceBox = new ChoiceBox<>();
    private final String[] types = {"Rzymski", "Krótki", "Domyślny", "Długi", "Alternatywny"};
    Date date = new Date();

    @FXML
    private Label dateLabel1 = new Label();


    // ---- METHODS

    public PrimaryController() throws FileNotFoundException{

    }

    public void buttonOption(){
        String typeChoose = stringChoiceBox.getValue();
        typOption(typeChoose);
    }

    private void typOption(String typeChoose) {
        String chooseLabel = "Obecny Format: " + typeChoose;
        int op1 = updateOp(typeChoose);
        switch(typeChoose){
            case "Rzymski":
                date.setOperator(op1);
                dateLabel1.setText(chooseLabel);
                update();
            case "Krótki":
                date.setOperator(op1);
                dateLabel1.setText(chooseLabel);
                update();
            case "Długi":
                date.setOperator(op1);
                dateLabel1.setText(chooseLabel);
                update();
            case "Alternatywny":
                date.setOperator(op1);
                dateLabel1.setText(chooseLabel);
                update();
            case "Domyślny":
                date.setOperator(op1);
                dateLabel1.setText(chooseLabel);
                update();
        }
    }
    public void update(){
        dateLabel2.setText(date.datePrinter());
    }

    private int updateOp(String string) {
        switch (string){
            case "Rzymski":
                return 3;
            case "Krótki":
                return 2;
            case "Long":
                return 1;
            case "Alternatywny":
                return 4;
            case "Domyślny":
                return 5;
        }
        return 6;
    }

    public void moveWeek(){
        date.moveWeek();
        update();
    }

    public void removeWeek(){
        date.removeWeek();
        update();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stringChoiceBox.getItems().addAll(types);
        stringChoiceBox.setValue("Default");
    }
}
