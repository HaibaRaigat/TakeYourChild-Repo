package group1.rfid;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Timer;

public class loginController {
    @FXML
    private Label login;
    @FXML
    private TextField email;

    @FXML
    private PasswordField pass;
    @FXML
    private ImageView error;
    @FXML
    private Label alert;
    @FXML
    private ImageView play;

    @FXML
    private Label smile;


    @FXML
    private Label welcome;

    @FXML
    private ImageView logo;

    @FXML
    private MediaView media;


    @FXML
    private ImageView pause;

    private Media media1;
    private MediaPlayer mediaPlayer;

    private double xOffset = 0;
    private double yOffset = 0;
    @FXML
    void playvid(MouseEvent event) throws MalformedURLException {

play.setVisible(false);
        media.setVisible(true);
        logo.setVisible(false);
        smile.setVisible(false);
        welcome.setVisible(false);
        pause.setVisible(true);
        media1 = new Media(getClass().getResource("/img/intro.mp4").toExternalForm());
        mediaPlayer=new MediaPlayer(media1);
        media.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.pause();
                media.setVisible(false);
                logo.setVisible(true);
                smile.setVisible(true);
                welcome.setVisible(true);
                play.setVisible(true);
                pause.setVisible(false);
            }
        });
    }
    @FXML
    void entrer(MouseEvent event) throws IOException {
        Stage stage=new Stage();
       if (email.getText().equals("admin@crmef.ma") && pass.getText().equals("123456")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

            Scene scene = new Scene(fxmlLoader.load(), 1097, 591);

            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            scene.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    xOffset = event.getSceneX();
                    yOffset = event.getSceneY();
                }
            });

            // move stage
            scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    stage.setX(event.getScreenX() - xOffset);
                    stage.setY(event.getScreenY() - yOffset);
                }
            });

            ((Node) event.getSource()).getScene().getWindow().hide();

      }else{
            error.setVisible(true);
            alert.setVisible(true);
        }
    }

    @FXML
    void pausevid(MouseEvent event) {
        mediaPlayer.pause();
        media.setVisible(false);
        logo.setVisible(true);
        smile.setVisible(true);
        welcome.setVisible(true);
        play.setVisible(true);
        pause.setVisible(false);

    }


    @FXML
    void shutdown(MouseEvent event) {
        Platform.exit();
    }


}
