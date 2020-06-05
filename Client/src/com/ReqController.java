package com;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

public class ReqController {

    @FXML
    private Text reqheader;

    @FXML
    private Label nameLabel;

    @FXML
    private Label startlabel;

    @FXML
    private Label finishlabel;

    @FXML
    private Label spacelabel;

    @FXML
    private Label datelabel;

    @FXML
    private Button acceptbutton;

    @FXML
    private Button rejectbutton;

    @FXML
    private TextField sendLabel;

    private String sender;
    private String username;

    public void transferMessage(String message) {
        //Display the message
        sender=message;
        nameLabel.setText(sender);

    }
    private ChatClient SelectedClient;

    public void initialize() throws IOException {

        String[] info = new String[26];
        Driver1 driver = new Driver1();
        Client1 client = new Client1();

        CostSubsystem costdata = new CostSubsystem();

        try {
            info = costdata.RetrieveUsDrData(driver, client);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
        String ClientName = info[14];
        String StartDestination = info[16];
        String FinishDestination = info[20];
        String SpaceRequired = info[24];
        String date = info[23];

        //System.out.println(Arrays.toString(info));
        //nameLabel.setText(sender);


                nameLabel.setText(ClientName);
                startlabel.setText(StartDestination);
                finishlabel.setText(FinishDestination);
                spacelabel.setText(SpaceRequired);
                datelabel.setText(date);


    }
    public void initData2(ChatClient client,String usernameclient){
        SelectedClient = client;
        username=usernameclient;
        System.out.println(client);

    }

            public void changeScreenButtonAccept (ActionEvent event) throws IOException {
       /* Parent parent2 = FXMLLoader.load(getClass().getResource("PaymentScreen.fxml"));

        Scene scene2 = new Scene(parent2);

        Stage window2= (Stage) ((Node) event.getSource()).getScene().getWindow();




        window2.setScene(scene2);
        window2.show();



        */
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {

                        //EDW PREPEI NA STEILW TO MINIMA STON PELATI NA PLIRWSEI
                        String sender = sendLabel.getText();
                        System.out.println(sender);
                        try {
                            SelectedClient.drivertoclient(sender, "del");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            });
       /* final ChatClient client;
        String senduser = sendusername.getText();
        String username1=username.toString();
        System.out.println("esteila to minimatk"+username1);
        SelectedClient.drivertoclient(senduser, "del");

        */

        }



    public void changeScreenButtonReject(ActionEvent event) throws IOException {
        Parent parent3 = FXMLLoader.load(getClass().getResource("DealErrorMsgClientScreen.fxml"));

        Scene scene3 = new Scene(parent3);

        Stage window3= (Stage) ((Node) event.getSource()).getScene().getWindow();
        window3.setScene(scene3);
        window3.show();
    }
}