package org.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class LoginController {
    @FXML
    public void entrar(ActionEvent evento) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaPrincipal.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node)evento.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
