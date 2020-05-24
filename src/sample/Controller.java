package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {

   // @FXML
    //private Button requestbutton;

  //  @FXML
   // public void changeScreenButtonPushed(ActionEvent event) throws IOException {
    //}
  @FXML
    public void changeScreenButtonPushed(javafx.event.ActionEvent event) throws IOException {
        Parent parent1 = FXMLLoader.load(getClass().getResource("ShowReqDetailsScreen.fxml"));

        Scene scene1 = new Scene(parent1);

        Stage window= (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
}
