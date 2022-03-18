package as;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

// Bei jeder Zahl if statement machen das man bei 0 die Zahl replaced [X]
// Additition []

public class Controller {
    public Label lblResult;
    Double sum1 = 0.0;
    Double sum2 = 0.0;
    Double calcresults;

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
                calcresults = sum1 + sum2;
                lblResult.setText(String.valueOf(calcresults));
                break;

            case "+":

                if (lblResult.getText().isEmpty()){
                    break;
                }
                else {
                    sum1 = Double.parseDouble(lblResult.getText());
                    lblResult.setText("0");


                }
            }
        }
    }