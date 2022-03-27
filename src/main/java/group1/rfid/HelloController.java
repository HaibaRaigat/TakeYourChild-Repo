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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.*;

//apache POI


// sentry imports
import io.sentry.Sentry;
import java.lang.Exception;

public class HelloController implements Initializable {

    @FXML
    private Button importer;
    @FXML
    private VBox vlist;
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

    private FileInputStream fis;
    private FileChooser fileChooser;
    private File file;
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
    @FXML
    private HBox hboxline;
    @FXML
    private VBox vboxlist;
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
    private TextField browse;



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

/////////////////////////////////////////////////////////////////////load barchart
        Series series3 = new Series();
        series3.setName("2005");
        series3.getData().add(new XYChart.Data("la petit", 12));
        series3.getData().add(new XYChart.Data("la Moyenne", 3));
        series3.getData().add(new XYChart.Data("la Grande", 9));
        series3.getData().add(new XYChart.Data("CP", 11));
        barchart.getData().addAll(series3);
////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////// Load Listes parents/eleves
List<user>users=new ArrayList<>(users());
for(int i=0;i<users.size();i++){
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation((getClass().getResource("bar.fxml")));
try{
    HBox hbox=fxmlLoader.load();
    barController bc=fxmlLoader.getController();
    bc.setData(users.get(i));
    vlist.getChildren().add(hbox);
} catch (IOException e) {
    e.printStackTrace();
}
}

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
    void exitme(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 823, 485);
        scene.getStylesheets().add(getClass().getResource("styleFX.css").toExternalForm());

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

        // n7arko stage
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    private List<user> users(){
        List<user>ls=new ArrayList<>();
        user us=new user();
        user us1=new user();
        user us2=new user();
        user us4=new user();
        user us5=new user();
        us.setImgsrc("/imgeskidsparent/1.jpg");
        us.setCode("12ED20CXS");
        us.setAdresse("RUE A NO 04 AVENUE DES ABCD ");
        us.setNom("Ahmed ABCD");
        ls.add(us);

        us5.setImgsrc("/imgeskidsparent/1.jpg");
        us5.setCode("12ED20CXS");
        us5.setAdresse("RUE A NO 04 AVENUED ");
        us5.setNom("AHMAD EFGH");
        ls.add(us);

        us1.setImgsrc("/imgeskidsparent/3.jpg");
        us1.setCode("13EDZSE34");
        us1.setAdresse("RUE EF NO 06 AVENUE DES EFGH ");
        us1.setNom("Ali EFGH");
        ls.add(us1);

        us2.setImgsrc("/imgeskidsparent/6.jpg");
        us2.setCode("16REDF343D");
        us2.setAdresse("RUE NG NO 22 AVENUE DES KLMNO ");
        us2.setNom("Mohammed kali");
        ls.add(us2);

        return ls;
    }

    @FXML
    void importexcel(MouseEvent event) throws FileNotFoundException {
        System.out.println("T E S T ");
    fileChooser = new FileChooser();
    FileChooser.ExtensionFilter xlsxFilter = new
            FileChooser.ExtensionFilter("XLSX files (*.xlsx)", "*.xlsx");
    FileChooser.ExtensionFilter xlsFilter = new
            FileChooser.ExtensionFilter("XLS files (*.xls)", "*.xls");


        fileChooser.getExtensionFilters().addAll(xlsxFilter, xlsFilter);

    //Show open file dialog
    file = fileChooser.showOpenDialog(null);
        if (file != null) {
        browse.setText(file.getAbsolutePath());

    }

}}

