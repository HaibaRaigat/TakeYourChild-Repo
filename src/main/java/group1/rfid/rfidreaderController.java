package group1.rfid;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
//import com.github.vaibhavsinha.kong.impl.KongClient;
import javafx.animation.KeyFrame;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.embed.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;
import javafx.scene.media.AudioClip;

import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

import javax.imageio.ImageIO;

public class rfidreaderController implements Initializable {
    public rfidreaderController() throws IOException {
    }
    //KongClient kongClient = new KongClient("http://localhost:8001");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        startCameraInput();


    }
    @FXML
    private ImageView showtv;

    @FXML
    private Rectangle recCard;

    @FXML
    private ImageView imagecam;

    @FXML
    private AnchorPane form;
    @FXML
    private Label buttonload;
    @FXML
    private Rectangle cardfound;



    /////////////////////////////////////////////CAMERA DECLARATION COMPENENTSS
    private BufferedImage grabbedImage;
    private WebcamPanel panel;
    private Webcam webcam;
    Image mainiamge;
    private ObjectProperty<Image> imageProperty = new SimpleObjectProperty<Image>();
    private boolean stopCamera = false;
    private QRDecoder qrDecoder = new QRDecoder();
    private boolean showingDialog = false;
    private long lastDirectlyOpenedTime = 0;

    Label mylabel= new Label();


   // Image imagec2 = new Image("/img/CARD1.png", 200, 277, false, true);
    //Image imagec3 = new Image("/img/CARD1.png", 200, 277, false, true);
    //Image imagec4 = new Image("/img/CARD1.png", 200, 277, false, true);
   Image imagec1 = new Image(getClass().getResourceAsStream("/img/CARD1.png"), 200, 277, false, true);
    Image imagec2 = new Image(getClass().getResourceAsStream("/img/CARD2.png"), 200, 277, false, true);
    Image imagec3 = new Image(getClass().getResourceAsStream("/img/CARD3.png"), 200, 277, false, true);
    Image imagec4 = new Image(getClass().getResourceAsStream("/img/CARD4.png"), 200, 277, false, true);

    /////////////////////////////////////////////CAMERA DECLARATION COMPENENTSS

    @FXML
    private ImageView hide;

    @FXML
    private Label test;
    @FXML
    private Rectangle cardRec;


    @FXML
    private TextField resultQR;

    @FXML
    private Circle circleQr;

    /////////////////////////////////////////////////////////////////////////////////////////////////NOT WORKED FHAD STAGE
    @FXML
    void dragme(MouseEvent event) {

    }
    private Stage stage;
    private Scene scene;
    private Parent root;
    ///////////////////////////////////////////////////////////////////////////////////////////////HIDE WINDOW
    @FXML
    void hideme(MouseEvent event) throws IOException {
       /* Stage stage = (Stage) hide.getScene().getWindow();
        stage.setIconified(true); */


    }


///////////////////////////////////////////////////////////////////////////////////////////////////

    private void startCameraInput() {
        Task<Void> webCamTask = new Task<Void>() {
            @Override
            protected Void call() {
                webcam = Webcam.getDefault();
                webcam.open();
                startWebCamStream();

                return null;
            }
        };

        Thread webCamThread = new Thread(webCamTask);
        webCamThread.setDaemon(true);
        webCamThread.start();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////START CAM PC////////////////////////////////////////////
    protected void startWebCamStream() {


        boolean stopCamera = false;

        Task<Void> task = new Task<Void>() {

            @Override
            protected Void call() {
                final AtomicReference<WritableImage> ref = new AtomicReference<>();
                BufferedImage img;

                //noinspection ConstantConditions,LoopConditionNotUpdatedInsideLoop
                while (!stopCamera) {
                    try {
                        if ((img = webcam.getImage()) != null) {
                            ref.set(SwingFXUtils.toFXImage(img, ref.get()));
                            img.flush();
                            Platform.runLater(() -> imageProperty.set(ref.get()));
                            String scanResult = qrDecoder.decodeQRCode(img);

                            if (scanResult != null ) {
                                onQrResult(scanResult);
                            }
                        }





                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                return null;
            }
        };

        Thread th = new Thread(task);
        th.setDaemon(true);
        th.start();

        imagecam.imageProperty().bind(imageProperty);

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////


    static Stage staticstage;
    Parent loaded=null;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void showcam(MouseEvent event) throws IOException{


        /*
Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Rectangle rec= tv.getRecParent();
                rec.setStroke(Color.GREEN);

            }
        });
*/



    }

    private void onQrResult(String scanResult) {

        Platform.runLater(() -> {
            resultQR.setText(scanResult);






















            //    Media toot = new Media(new File("/home/marklee/Downloads/PROJECTG1/src/main/resources/img/beep.mp3").toURI().toString());
               // MediaPlayer player = new MediaPlayer(toot);
                //player.play();

                //player.play();
            AudioClip buzzer = new AudioClip(getClass().getResource("/img/beep.wav").toExternalForm());
buzzer.play();

        });}
    @FXML
    void textchange(ActionEvent event) {

    }

    @FXML
    void show(MouseEvent event) throws IOException {

        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("tv.fxml"));
        Parent root1 = (Parent) fxmlloader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root1));
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.show();

        resultQR.textProperty().addListener((observable, oldValue, newValue) -> {


            System.out.println("textfield changed from " + oldValue + " to " + newValue);

            if(resultQR.getText().equals("12ED20CN79")) {
              recCard.setFill(new ImagePattern(imagec1));
                recCard.setStroke(Color.valueOf("#03975B"));
                cardfound.setFill(Color.valueOf("#03975B"));
                cardfound.setStroke(Color.valueOf("#03975B"));
                tvController tv = fxmlloader.getController();
                tv.toGreen();
                tv.card1();

            }

            if(resultQR.getText().equals("13EC33VM88")) {
              recCard.setFill(new ImagePattern(imagec2));
                tvController tv = fxmlloader.getController();
                tv.toGreen();
                tv.Card2();
            }

            if(resultQR.getText().equals("22SA43FN43")) {
              recCard.setFill(new ImagePattern(imagec3));
                tvController tv = fxmlloader.getController();
                tv.toGreen();
                tv.Card3();
            }

            if(resultQR.getText().equals("78ZE34DCV7")) {
              recCard.setFill(new ImagePattern(imagec4));
                tvController tv = fxmlloader.getController();
                tv.toGreen();
                tv.Card4();
            }

        });


    }



}



