package CompletedDeals;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
//import java.util
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public TableView<CompletedDeal> CompletedDeal;
    public TableColumn<CompletedDeal, String> nameColumn;
    public TableColumn<CompletedDeal, String> startColumn;
    public TableColumn<CompletedDeal, String> destinationColumn;
    public TableColumn<CompletedDeal, String> dateColumn;
    public TableColumn<CompletedDeal, String> requestColumn;
    public TableColumn<CompletedDeal, String> requestColumn1;

    @Override
    public void initialize  (URL location, ResourceBundle resources) {


        //Name column
        /// TableColumn<DriverPost, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Startdest column
        //  TableColumn<DriverPost, Double> startColumn = new TableColumn<>("Start");
        startColumn.setCellValueFactory(new PropertyValueFactory<>("start"));

        //Finish dest column
        //   TableColumn<DriverPost, String> destinationColumn = new TableColumn<>("Destination");
        destinationColumn.setCellValueFactory(new PropertyValueFactory<>("destination"));



        //Date Column
        //    TableColumn<DriverPost, String> dateColumn = new TableColumn<>("Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        //Req Column
        //   TableColumn<DriverPost, String> requestColumn = new TableColumn<>("Request");
        requestColumn.setCellValueFactory(new PropertyValueFactory<>("button1"));

        requestColumn1.setCellValueFactory(new PropertyValueFactory<>("button2"));


        CompletedDeal.setItems(observableList);
    }

    //Get all of the posts
    // public ObservableList<DriverPost> getDriverPost(){
    final   ObservableList<CompletedDeal> observableList = FXCollections.observableArrayList(
            new CompletedDeal("Nikos Matsablokos", "Larisa", "Athens",  "15/5/2020"),
            new CompletedDeal("Stavros Panagiotopoulos", "Lamia", "Thessaloniki", "20/5/2020"),
            new CompletedDeal("Nikos Koukos", "Trikala", "Patra", "11/6/2020"),
            new CompletedDeal("Nikos Kalantas", "Athens", "Frankfurt", "14/6/2020"),
            new CompletedDeal("Panagiotis Seremetidis", "Crete", "Kozani", "30/6/2020")
            //return driverposts;
    );

}

