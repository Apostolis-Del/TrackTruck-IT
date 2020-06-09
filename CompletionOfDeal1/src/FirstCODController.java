import javafx.event.ActionEvent;

import java.io.IOException;

public class FirstCODController {

    private ChatClient SelectedClient;

    public void reportbuttonpushed(ActionEvent actionEvent) throws IOException {
        SelectedClient.drivertoclient("client","del");


    }

    public void deliveredbuttonpushed(ActionEvent actionEvent) throws IOException {
        //EDW PREPEI NA MPEI TO RATINGS/COMPLAINTS
        SelectedClient.ratings("client","del");

    }

    public void initData(ChatClient client,String usernameclient){
        SelectedClient = client;
        //username.setText(usernameclient);

    }

    public void trackingoforderbuttonpushed(ActionEvent actionEvent) throws IOException {
        //EDW PREPEI NA MPEI TO TOO
        SelectedClient.trackingoforder("client","del");

    }
}
