import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DealErrorClientController {
    @FXML
    public Button drivermenubutton;


    public void drivermenubuttonclicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample.fxml"));
        Parent firstscreenparent = loader.load();
        Scene firstscreensecene = new Scene(firstscreenparent);

        Stage window2= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window2.setScene(firstscreensecene);
        window2.show();
    }
}
