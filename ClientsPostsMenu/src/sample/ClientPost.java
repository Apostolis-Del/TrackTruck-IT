package sample;
import javafx.scene.control.Button;

public class ClientPost {
    private String name;
    private String start;
    private String destination;
    private int space;
    private String date;
    private Button button;

    public ClientPost(String name, String start, String destination, int space, String date){
        this.name = name;
        this.start = start;
        this.destination = destination;
        this.space = space;
        this.date = date;
        this.button = new Button("Send Request");

    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSpace() {
        return space;
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
    public void setSpace(int space) {
        this.space = space;
    }

    public  String getStart() {
        return start;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setButton(Button button){
        this.button = button;
    }
    public Button getButton()
    {
        return button;
    }
}