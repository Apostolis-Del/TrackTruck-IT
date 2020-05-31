package DriverPosts1;
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
    public TableView<DriverPost> DriverPosts;
    public TableColumn<DriverPost, String> nameColumn;
    public TableColumn<DriverPost, String> startColumn;
    public TableColumn<DriverPost, String> destinationColumn;
    public TableColumn<DriverPost, String> spaceColumn;
    public TableColumn<DriverPost, String> dateColumn;
    public TableColumn<DriverPost, String> requestColumn;
    public TextField ReturnFilteredDposts;
    public Label label;

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

        DriverPosts.setItems(observableList);
    }

    //Get all of the posts
      final   ObservableList<DriverPost> observableList = FXCollections.observableArrayList(
       new DriverPost ("Nikos Matsablokos", "Larisa", "Athens", 55, "15/5/2020"),
       new DriverPost ("Stavros Panagiotopoulos", "Lamia", "Thessaloniki", 25,"20/5/2020"),
            new DriverPost ("Nikos Koukos", "Trikala", "Patra", 40,"11/6/2020"),
       new DriverPost ("Nikos Kalantas", "Athens", "Frankfurt", 10,"14/6/2020"),
       new  DriverPost ("Panagiotis Seremetidis", "Crete", "Kozani", 16,"30/6/2020")
        //return driverposts;
    );
    FilteredList<DriverPost> filteredData = new FilteredList<>(observableList, e -> true);

    // 2. Set the filter Predicate whenever the filter changes.
  @FXML
  private void ReturnFilteredDposts(KeyEvent event){


      ReturnFilteredDposts.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(driverpost -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) return true;

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (driverpost.getDestination().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (driverpost.getStart().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches last name.
                }
                return false; // Does not match.
            });
        });

        SortedList<DriverPost> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(DriverPosts.comparatorProperty());
        DriverPosts.setItems(sortedData);
    }

}


