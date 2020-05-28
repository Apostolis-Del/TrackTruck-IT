package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextArea username;

    @FXML
    private TextArea password;



    public void onloginbuttonclicked(javafx.event.ActionEvent actionEvent) {
        ChatClient client=new ChatClient("localhost", 8818);;
        client.connect();
        String username2 = username.getText();
        String password2 = username.getText();

        try {
            if (client.login(username2, password2)) {
                Parent parent2 = FXMLLoader.load(getClass().getResource("FirstScreen.fxml"));

                Scene scene2 = new Scene(parent2);

                Stage window2= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                window2.setScene(scene2);
                window2.show();
            } else {
                System.out.println("wrong uspass");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}