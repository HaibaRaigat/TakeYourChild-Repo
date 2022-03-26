package group1.rfid;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class fxmlcontroller {
    @FXML
    private Button b1;

    @FXML
    private Label l1;

    @FXML
    void touch(MouseEvent event) {
l1.setText("hello");
    }
}
