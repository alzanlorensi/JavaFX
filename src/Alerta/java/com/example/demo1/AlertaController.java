package com.example.demo1;

import GUI.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

        Alerts.ShowAlert("Titulo",null,"Erro 404", Alert.AlertType.ERROR);
    }
}