package as;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

// Bei jeder Zahl if statement machen das man bei 0 die Zahl replaced [X]
// Rechnung fertig [X]

public class Controller {
    public Label lblResult;
    public Button btndot;
    public Button btn0;
    public Button btn3;
    public Button btn2;
    public Button btn1;
    public Button btn6;
    public Button btn5;
    public Button btn4;
    public Button btnclear;
    public Button btn9;
    public Button btn8;
    public Button btn7;
    public GridPane BackgroundColor;
    Double sum1 = 0.0;
    Double sum2 = 0.0;
    Double calcresults;
    private String operator = "";

    public void onBtn(ActionEvent actionEvent){
        Button btn = (Button) actionEvent.getSource();

        switch (btn.getText()){

            case "0":

                if (lblResult.getText().startsWith("0")){
                    break;
                }

                else {

                lblResult.setText(lblResult.getText()+ "0");
                break;
                }

            case "1":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("1");
                }

                else

                lblResult.setText(lblResult.getText()+ "1");
                break;

            case "2":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("2");
                }

                else

                lblResult.setText(lblResult.getText()+ "2");
                break;

            case "3":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("3");
                }

                else

                lblResult.setText(lblResult.getText()+ "3");
                break;

            case "4":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("4");
                }

                else

                lblResult.setText(lblResult.getText()+ "4");
                break;

            case "5":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("5");
                }

                else

                lblResult.setText(lblResult.getText()+ "5");
                break;

            case "6":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("6");
                }

                else

                lblResult.setText(lblResult.getText()+ "6");
                break;

            case "7":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("7");
                }

                else

                lblResult.setText(lblResult.getText()+ "7");
                break;

            case "8":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("8");
                }

                else

                lblResult.setText(lblResult.getText()+ "8");
                break;

            case "9":

                if (lblResult.getText().equals("0")){
                    lblResult.setText("9");
                }

                else

                lblResult.setText(lblResult.getText()+ "9");
                break;

            case ".":

                if (lblResult.getText().contains(".")){
                    break;
                }

                else if (lblResult.getText().isEmpty()){
                    lblResult.setText("0.");
                }

                else{

                lblResult.setText(lblResult.getText()+ ".");
                break;
                }

            case "C":

                lblResult.setText("0");{
                    break;
                }

            case "=":

                sum2 = Double.parseDouble(lblResult.getText());

                switch (operator){
                    // case "+": lblResult.setText((sum1+sum2) + "");
                    // break;
                    case "-": calcresults = (sum1-sum2);
                        lblResult.setText(String.valueOf(calcresults));
                        break;
                    case "*": calcresults = (sum1*sum2);
                        lblResult.setText(String.valueOf(calcresults));
                        break;
                    case "/": calcresults = (sum1/sum2);
                        lblResult.setText(String.valueOf(calcresults));
                        break;
                    case "+": calcresults = (sum1+sum2);
                        lblResult.setText(String.valueOf(calcresults));
                        break;
                }
break;
            case "+":

                if (lblResult.getText().isEmpty()){
                    break;
                }
                else{
                    sum1 = Double.parseDouble(lblResult.getText());
                    lblResult.setText("0");
                    operator = "+";


                }
                break;

            case "/":

                if (lblResult.getText().isEmpty()){
                    break;
                }
                else{
                    sum1 = Double.parseDouble(lblResult.getText());
                    lblResult.setText("0");
                    operator = "/";


                }
                break;

            case "-":

                if (lblResult.getText().isEmpty()){
                    break;
                }
                else{
                    sum1 = Double.parseDouble(lblResult.getText());
                    lblResult.setText("0");
                    operator = "-";


                }
                break;

            case "*":

                if (lblResult.getText().isEmpty()){
                    break;
                }
                else{
                    sum1 = Double.parseDouble(lblResult.getText());
                    lblResult.setText("0");
                    operator = "*";


                }
                break;
        }
        }

    public void setGlobalKeyPressed(Scene scene) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case DIGIT0:
                        btn0.fire();

                        break;
                    case DIGIT1:
                        btn1.fire();

                        break;
                    case DIGIT2:
                        btn2.fire();

                        break;
                    case DIGIT3:
                        btn3.fire();

                        break;
                    case DIGIT4:
                        btn4.fire();

                        break;
                    case DIGIT5:
                        btn5.fire();

                        break;
                    case DIGIT6:
                        btn6.fire();

                        break;
                    case DIGIT7:
                        btn7.fire();
                        ;
                    case DIGIT8:
                        btn8.fire();

                        break;
                    case DIGIT9:
                        btn9.fire();

                        break;
                    case PERIOD:
                        btndot.fire();

                        break;

                }
                keyEvent.consume();
            }
        });
    }


    @FXML
    private void backGroundWindow() throws IOException {
        Stage backgroundWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("BackgroundColor.fxml"));

        fxmlLoader.setController(new BackgroundController(BackgroundColor));
        Scene scene = new Scene(fxmlLoader.load(), 340, 180);

        backgroundWindow.initModality(Modality.APPLICATION_MODAL);
        backgroundWindow.setScene(scene);
        backgroundWindow.setTitle("Background Color Picker");
        backgroundWindow.setResizable(true);
        backgroundWindow.show();

    }

    public void setGlobalKeyPressed(KeyEvent keyEvent) {

                switch (keyEvent.getCode()) {
                    case DIGIT0:
                        btn0.fire();

                        break;
                    case DIGIT1:
                        btn1.fire();

                        break;
                    case DIGIT2:
                        btn2.fire();

                        break;
                    case DIGIT3:
                        btn3.fire();

                        break;
                    case DIGIT4:
                        btn4.fire();

                        break;
                    case DIGIT5:
                        btn5.fire();

                        break;
                    case DIGIT6:
                        btn6.fire();

                        break;
                    case DIGIT7:
                        btn7.fire();
                        ;
                    case DIGIT8:
                        btn8.fire();

                        break;
                    case DIGIT9:
                        btn9.fire();

                        break;
                    case PERIOD:
                        btndot.fire();

                        break;

                }
                keyEvent.consume();
            }
}