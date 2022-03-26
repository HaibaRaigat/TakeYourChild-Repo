package group1.rfid;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class barController {
    @FXML
    private Label adresse;

    @FXML
    private Label code;

    @FXML
    private ImageView delete;

    @FXML
    private ImageView edit;

    @FXML
    private Circle img;

    @FXML
    private Circle img1;

    @FXML
    private Circle img11;

    @FXML
    private Label nom;

    /////////////////////////////////////////////////////////////////////////////////////////////////////

public void setData(user user1){
    Image image1 = new Image(getClass().getResourceAsStream(user1.getImgsrc()));
    img.setFill(new ImagePattern(image1));
    code.setText(user1.getCode());
    nom.setText(user1.getNom());
    adresse.setText(user1.getAdresse());


}

}
