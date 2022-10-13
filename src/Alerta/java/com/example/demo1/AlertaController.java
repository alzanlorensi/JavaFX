package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AlertaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Applicationn!");
    }
    private Button teste_de_evento;
    public void onteste_de_eventoAction(){
        System.out.println("Click");
    }
}