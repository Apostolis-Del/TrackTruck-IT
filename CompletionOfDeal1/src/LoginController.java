import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class LoginController extends Component {

    @FXML
    private TextArea username;

    @FXML
    private TextArea password;

    public void initialize() throws IOException {
        ChatClient client = new ChatClient("localhost", 8818);
        ;
        String username2 = username.getText();


    }

    public void onloginbuttonclicked(javafx.event.ActionEvent actionEvent) throws IOException {
        ChatClient client = new ChatClient("localhost", 8818);
        ;
        client.connect();
        String username2 = username.getText();
        String password2 = username.getText();


        try {
            if (client.login(username2, password2)) {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("FirstCODScreen.fxml"));
                Parent firstscreenparent = loader.load();
                Scene firstscreensecene = new Scene(firstscreenparent);

                //access the controller and call a method
                FirstCODController controller = loader.getController();
                controller.initData(client, username2);


                Stage window2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                window2.setScene(firstscreensecene);
                window2.show();


            } else {
                System.out.println("wrong uspass");
                JOptionPane.showMessageDialog(this, "Invalid login/password.");


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}