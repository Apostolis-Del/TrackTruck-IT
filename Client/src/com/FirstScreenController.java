package com;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


import java.awt.*;
import java.io.IOException;

public class FirstScreenController {

    //  @FXML
    // public void changeScreenButtonPushed(ActionEvent event) throws IOException {
    //}

    @FXML
    private Button requestbutton;

    @FXML
    private TextField sendusername;

    @FXML
    private Label username;

    private ChatClient SelectedClient;
    //private String usernameclient;


    @FXML
    public void changeScreenButtonPushed(javafx.event.ActionEvent event) throws IOException {
        final ChatClient client;
        String senduser = sendusername.getText();
        String username1=username.toString();
        System.out.println("esteila to minimatk"+username1);
        SelectedClient.start(senduser, "del");
        System.out.println(SelectedClient);
        //SelectedClient.drivertoclient(senduser, "del");


        //FXMLLoader loader = new FXMLLoader(getClass().getResource("ReqController.fxml"));
       // Parent root = loader.load();
       // ReqController req=loader.getController();
        //req.transferMessage(senduser);

        //SelectedClient.start(senduser, "del");

        //Parent parent1 = FXMLLoader.load(getClass().getResource("ShowReqDetailsScreen.fxml"));

         // Scene scene1 = new Scene(parent1);

         // Stage window= (Stage) ((Node) event.getSource()).getScene().getWindow();
         // window.setScene(scene1);
         // window.show();



    }
    public void initData(ChatClient client,String usernameclient){
          SelectedClient = client;
          username.setText(usernameclient);

    }



}
