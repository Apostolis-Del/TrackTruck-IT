package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentController {
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
