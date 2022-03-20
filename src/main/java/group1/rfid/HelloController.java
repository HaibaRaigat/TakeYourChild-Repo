package group1.rfid;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.*;

// sentry imports
import io.sentry.Sentry;
import java.lang.Exception;

public class HelloController implements Initializable {
    @FXML
    private Label labdash1;
    @FXML
    private Pane elevepane;
    @FXML
    private Label labdash2;
    @FXML
    private ImageView exit;
    @FXML
    private Label labdash3;

    @FXML
    private Label labdash4;
    @FXML
    private Circle recdash1;

    @FXML
    private Circle recdash2;

    @FXML
    private Circle recdash3;

    @FXML
    private Circle recdash4;
    @FXML
    private ImageView dash;
    @FXML
    private ProgressIndicator prog1;
    @FXML
    private Label lab1;
//////////////////////////////////////initialize bar chart  //
    @FXML
    private BarChart<String,Number> barchart;
    @FXML
    private CategoryAxis x;
    @FXML
    private NumberAxis y;

/////////////////////////////////////////////////////////

    Image image1 = new Image(getClass().getResourceAsStream("/imgeskidsparent/2.jpg"));
    Image image2 = new Image(getClass().getResourceAsStream("/imgeskidsparent/3.jpg"));
    Image image3 = new Image(getClass().getResourceAsStream("/imgeskidsparent/6.jpg"));
    Image image4 = new Image(getClass().getResourceAsStream("/imgeskidsparent/8.jpg"));


    @FXML
    private Label refresh;
    @FXML
    private ImageView dashcolor;

    @FXML
    private ImageView kids;

    @FXML
    private ImageView kids2;

    @FXML
    private ImageView menu;

    @FXML
    private Rectangle rec1;

    @FXML
    private Rectangle rec2;

    @FXML
    private Rectangle rec3;

    @FXML
    private Rectangle rec4;

    @FXML
    private ImageView menu2;

    @FXML
    private Pane panekmala;

    @FXML
    private ImageView parent;

    @FXML
    private ImageView parent2;

    @FXML
    private ImageView tv;

    @FXML
    private ImageView tv2;

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    void showtv(MouseEvent event) throws IOException {

        //Close the platform using node
        ((Node) event.getSource()).getScene().getWindow().hide();
        ///load RFID READE ::/MARK LEE
        Parent root12 = FXMLLoader.load(getClass().getResource("RFIDREADER1.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(root12, 540, 398));
        stage2.initStyle(StageStyle.UNDECORATED);
        stage2.show();

        //MOVE FORM RFID READER :
        root12.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        //move around here
        root12.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage2.setX(event.getScreenX() - xOffset);
                stage2.setY(event.getScreenY() - yOffset);
            }
        });

        ////////////////////////////////
    }

    @FXML
    void hide1(MouseEvent event) {
        rec1.setVisible(false);
    }

    @FXML
    void hide2(MouseEvent event) {
        rec2.setVisible(false);
    }

    @FXML
    void hide3(MouseEvent event) {
        rec3.setVisible(false);

    }

    @FXML
    void hide4(MouseEvent event) {
        rec4.setVisible(false);

    }

    @FXML
    void show1(MouseEvent event) {
        rec2.setVisible(true);

    }

    @FXML
    void show2(MouseEvent event) {
        rec3.setVisible(true);

    }

    @FXML
    void show3(MouseEvent event) {
        rec4.setVisible(true);

    }


    @FXML
    void slide(MouseEvent event) {

       panekmala.setVisible(true);
        menu2.setVisible(true);
        menu.setVisible(false);





    }

    @FXML
    void slide2(MouseEvent event) {
        panekmala.setVisible(false);
        menu.setVisible(true);


    }
    public static void main(String[] args) {

    }

    @FXML
    void mcha(MouseEvent event) {

    }

    @FXML
    void hada(MouseEvent event) {
        rec1.setVisible(true);
    }

    @FXML
    void over(MouseDragEvent event) {

    }

    public void reclab1(){
        recdash1.setFill(new ImagePattern(image1));
        labdash1.setText("Saad Alian");
    }
    public void reclab2(){
        recdash1.setFill(new ImagePattern(image2));
        labdash1.setText("Ahmad Crmef");
    }
    public void reclab3(){
        recdash1.setFill(new ImagePattern(image3));
        labdash1.setText("Salma Rafik");
    }
    public void reclab4(){
        recdash1.setFill(new ImagePattern(image4));
        labdash1.setText("Ala Child");
    }
    private SortedMap<String, Integer> _points;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      //sentryCheck();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));





        Series series3 = new Series();
        series3.setName("2005");
        series3.getData().add(new XYChart.Data("la petit", 12));
        series3.getData().add(new XYChart.Data("la Moyenne", 3));
        series3.getData().add(new XYChart.Data("la Grande", 9));
        series3.getData().add(new XYChart.Data("CP", 11));
        barchart.getData().addAll(series3);




    }


    public void sentryCheck(){
        Sentry.init(options -> {
            options.setDsn("https://ce6324f2898c4446ba667f22cd44ab2c@o1170705.ingest.sentry.io/6264459");
            // Set tracesSampleRate to 1.0 to capture 100% of transactions for performance monitoring.
            // We recommend adjusting this value in production.
            options.setTracesSampleRate(1.0);
            // When first trying Sentry it's good to see what the SDK is doing:
            options.setDebug(true);
        });


    }
    @FXML
    void refreshme(MouseEvent event) {
reclab1();
reclab2();
reclab3();
reclab4();

    }

    @FXML
    void showpaneeleve(MouseEvent event) {
elevepane.setVisible(true);
    }


    @FXML
    void showdash(MouseEvent event) {
        elevepane.setVisible(false);

    }

    @FXML
    void exitme(MouseEvent event) {
Platform.exit();
    }
    }
