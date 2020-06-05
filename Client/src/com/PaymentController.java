package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import static java.lang.String.valueOf;

public class PaymentController {
    public Text costLabel;

    public void initialize() throws SQLException, ClassNotFoundException {
/*
        final ChatClient client;
        String senduser = sendusername.getText();
        String username1=username.toString();
        System.out.println("esteila to minimatk"+username1);
        SelectedClient.start(senduser, "del");

 */

        Driver1 driver = new Driver1();
        Client1 client = new Client1();

        CostSubsystem costsub = new CostSubsystem();
        String[] info =costsub.RetrieveUsDrData(driver, client);

        Double finalcost = costsub.CostProcessing(info);
        int value = (int)Math.round(finalcost);

        costLabel.setText(valueOf(value));

    }



        public void changeScreenButtonPay(ActionEvent event) throws IOException {
        Parent parent4 = FXMLLoader.load(getClass().getResource("PaymentScreen.fxml"));

        Scene scene4 = new Scene(parent4);

        Stage window4= (Stage) ((Node) event.getSource()).getScene().getWindow();
        window4.setScene(scene4);
        window4.show();
    }

    public void changeScreenButtonCancel(ActionEvent event) throws IOException {
        Parent parent5 = FXMLLoader.load(getClass().getResource("DealErrorMsgDriverScreen.fxml"));

        Scene scene5 = new Scene(parent5);

        Stage window5= (Stage) ((Node) event.getSource()).getScene().getWindow();
        window5.setScene(scene5);
        window5.show();
    }
}
