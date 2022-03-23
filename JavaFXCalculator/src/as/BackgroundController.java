package as;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class BackgroundController {
    private GridPane BackgroundColor;
    public BackgroundController(GridPane grid){
        this.BackgroundColor = grid;
    }
    @FXML
    private void RedPressed(){
        BackgroundColor.setStyle("-fx-background-color: red");
    }
    @FXML
    private void GreenPressed(){
        BackgroundColor.setStyle("-fx-background-color: green");
    }
    @FXML
    private void BluePressed(){
        BackgroundColor.setStyle("-fx-background-color: blue");
    }
}
