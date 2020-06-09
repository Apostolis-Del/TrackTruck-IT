package sample;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
//import java.util
import javafx.event.ActionEvent;
import java.net.URL;
import java.sql.Driver;
import java.util.ResourceBundle;



public class Controller<b, e> implements Initializable{
    public TableView<ClientPost> DriverPosts;
    public TableColumn<ClientPost, String> nameColumn;
    public TableColumn<ClientPost, String> startColumn;
    public TableColumn<ClientPost, String> destinationColumn;
    public TableColumn<ClientPost, String> spaceColumn;
    public TableColumn<ClientPost, String> dateColumn;
    public TableColumn<ClientPost, String> requestColumn;

    @Override

    public void initialize  (URL location, ResourceBundle resources) {


        //Name column
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Startdest column
        startColumn.setCellValueFactory(new PropertyValueFactory<>("start"));

        //Finish dest column
        destinationColumn.setCellValueFactory(new PropertyValueFactory<>("destination"));

        //Space Column
        spaceColumn.setCellValueFactory(new PropertyValueFactory<>("space"));

        //Date Column
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        //Req Column
        requestColumn.setCellValueFactory(new PropertyValueFactory<>("button"));

    }

    //Get all of the posts
    final   ObservableList<ClientPost> observableList = FXCollections.observableArrayList(
            new ClientPost ("Kostas Kalatravas", "Larisa", "Athens", 3, "15/5/2020"),
            new ClientPost ("Stavros Georgeas", "Lamia", "Thessaloniki", 10,"20/5/2020"),
            new ClientPost ("Apostolos Stamos", "Trikala", "Patra", 6,"11/6/2020"),
            new ClientPost ("Nikos Kalantas", "Athens", "Frankfurt", 12,"14/6/2020"),
            new  ClientPost ("Panagiotis Seremetidis", "Crete", "Kozani", 10,"30/6/2020")
            //return clientposts;
    );


    public void ReturnClientPosts(ActionEvent actionEvent) {
        DriverPosts.setItems(observableList);

    }
}
