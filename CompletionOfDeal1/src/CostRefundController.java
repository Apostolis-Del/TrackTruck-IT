import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.sql.SQLException;
import javafx.scene.control.Label;


import static java.lang.String.valueOf;

public class CostRefundController {
    @FXML
    private Label moneybutton;

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

        moneybutton.setText(valueOf(value));

    }
}
