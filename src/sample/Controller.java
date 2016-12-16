package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField text;
    private long nb=0;
    private long nb2=0;
    private String op = " ";
    private boolean b=false;
    @FXML
    private void handel(ActionEvent event) {
        if (b == false) {
            text.setText("");
            b=true;
        }
        String str = ((Button) (event.getSource())).getText();
            text.setText(text.getText() + str);
    }
    @FXML
    private void handel2(ActionEvent event) {
        String str2 = ((Button) (event.getSource())).getText();
        if (!str2.equals("=")) {
            if (!op.isEmpty()) {
                return;
            }
        nb = Long.parseLong(text.getText());
        op = str2;
        text.setText("");
    } else {
            if (op.isEmpty()) {
                return;
            }
            nb2 = Long.parseLong(text.getText());
            text.setText(String.valueOf(operation(op)));
            op = " ";
        }
    }
    private long operation(String a) {
        long f = 0;
        switch (a) {
            case "+":
                f = nb + nb2;
                break;
            case "*":
                f = nb * nb2;
                break;
            case "-":
                f = nb - nb2;
                break;
            case "/":
                f = nb2 - nb;
                break;
            default:
                f = 0;
        }
return f;
    }
}

