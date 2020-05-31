package CompletedDeals;
import javafx.scene.control.Button;

public class CompletedDeal {
    private String name;
    private String start;
    private String destination;
    private String date;
    private Button button1;
    private Button button2;


    public CompletedDeal(){
        this.name = "";
        this.start = "";
        this.destination = "";
        this.date = "";
    }

    public CompletedDeal(String name, String start, String destination, String date){
        this.name = name;
        this.start = start;
        this.destination = destination;
        this.date = date;
        this.button1 = new Button("Add rating");
        this.button2 = new Button("Send Complaints");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStart() {
        return start;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setButton1(Button button1){
        this.button1 = button1;
    }
    public Button getButton1()
    {
        return button1;
    }
    public void setButton2(Button button2){
        this.button2 = button2;
    }
    public Button getButton2()
    {
        return button2;
    }
}
