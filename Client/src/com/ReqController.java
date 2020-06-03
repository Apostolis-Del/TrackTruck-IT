package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    public void initialize() {

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
        nameLabel.setText(ClientName);
        startlabel.setText(StartDestination);
        finishlabel.setText(FinishDestination);
        spacelabel.setText(SpaceRequired);
        datelabel.setText(date);

    }

    public void changeScreenButtonAccept(ActionEvent event) throws IOException {
        Parent parent2 = FXMLLoader.load(getClass().getResource("PaymentScreen.fxml"));

        Scene scene2 = new Scene(parent2);

        Stage window2= (Stage) ((Node) event.getSource()).getScene().getWindow();
        window2.setScene(scene2);
        window2.show();
    }

    public void changeScreenButtonReject(ActionEvent event) throws IOException {
        Parent parent3 = FXMLLoader.load(getClass().getResource("DealErrorMsgClientScreen.fxml"));

        Scene scene3 = new Scene(parent3);

        Stage window3= (Stage) ((Node) event.getSource()).getScene().getWindow();
        window3.setScene(scene3);
        window3.show();
    }
}