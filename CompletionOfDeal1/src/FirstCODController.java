import javafx.event.ActionEvent;

import java.io.IOException;

public class FirstCODController {

    private ChatClient SelectedClient;

    public void reportbuttonpushed(ActionEvent actionEvent) throws IOException {
        SelectedClient.drivertoclient("client","del");


    }

    public void deliveredbuttonpushed(ActionEvent actionEvent) {
        //EDW PREPEI NA MPEI TO RATINGS/COMPLAINTS
    }

    public void initData(ChatClient client,String usernameclient){
        SelectedClient = client;
        //username.setText(usernameclient);

    }

    public void trackingoforderbuttonpushed(ActionEvent actionEvent) {
        //EDW PREPEI NA MPEI TO TOO
    }
}
