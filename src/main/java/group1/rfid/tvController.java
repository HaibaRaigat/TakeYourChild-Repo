package group1.rfid;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;

public class tvController {

    @FXML
    private ImageView close;

    @FXML
    private Rectangle RecAnim2;

    @FXML
    private Label labeldelivred;

    @FXML
    private Rectangle RecAnima1;

    @FXML
    private Rectangle RecKids;

    @FXML
    private Rectangle RecKids2;


    @FXML
    private Rectangle RecKids3;

    @FXML
    private Circle circfill1;

    @FXML
    private Circle circfill2;

    @FXML
    private Circle circfill3;

    @FXML
    private Circle circfill4;

    @FXML
    private Rectangle recfill1;

    @FXML
    private Rectangle recfill2;

    @FXML
    private Rectangle recfill3;

    @FXML
    private Rectangle recfill4;

    @FXML
    private Label labelfill1;

    @FXML
    private Label labelfill2;

    @FXML
    private Label labelfill3;

    @FXML
    private Label labelfill4;


    @FXML
    private Rectangle RecParent;

    @FXML
    private Rectangle RecParent2;


    @FXML
    private Rectangle RecParent3;


    @FXML
    private Circle circleVer;

    @FXML
    private Label label1;

    @FXML
    private Label label12;

    @FXML
    private Pane navbar;

    @FXML
    private ImageView imgcard1;

    @FXML
    private ImageView imgcard2;

    @FXML
    private Label labelcard1;

    @FXML
    private Label labelcard2;

    @FXML
    private Circle circledeliv;

    @FXML
    private Label labeldeliv;

    @FXML
    private Rectangle recdeliv;

    Image image1 = new Image(getClass().getResourceAsStream("/imgeskidsparent/1.jpg"), 200, 277, false, true);
    Image image2 = new Image(getClass().getResourceAsStream("/imgeskidsparent/2.jpg"), 200, 277, false, true);
    Image image3 = new Image(getClass().getResourceAsStream("/imgeskidsparent/3.jpg"), 200, 277, false, true);
    Image image4 = new Image(getClass().getResourceAsStream("/imgeskidsparent/4.jpg"), 200, 277, false, true);
    Image image5 = new Image(getClass().getResourceAsStream("/imgeskidsparent/5.jpg"), 200, 277, false, true);
    Image image6 = new Image(getClass().getResourceAsStream("/imgeskidsparent/6.jpg"), 200, 277, false, true);
    Image image7 = new Image(getClass().getResourceAsStream("/imgeskidsparent/7.jpg"), 200, 277, false, true);
    Image image8 = new Image(getClass().getResourceAsStream("/imgeskidsparent/8.jpg"), 200, 277, false, true);



    @FXML
    void showImg(MouseEvent event) throws IOException {


/*


        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                Image image1 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\1.jpg",258,318,false,true);
                Image image2 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\2.jpg",258,318,false,true);
                Image image3 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\3.jpg",258,318,false,true);
                Image image4 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\4.jpg",258,318,false,true);
                Image image5 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\5.jpg",258,318,false,true);
                Image image6 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\6.jpg",258,318,false,true);
                Image image7 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\7.jpg",258,318,false,true);
                Image image8 = new Image("D:\\PROJECTG1\\src\\main\\resources\\group1\\rfid\\imgeskidsparent\\8.jpg",258,318,false,true);

                int x=1;
                int i=2;
                int j=8;
                int k=9;
                int m=11;
                int n=12;
                int l=13;
                int o=18;


                Timeline timeline = new Timeline(

                        ///
                        new KeyFrame(Duration.seconds(x), e -> RecKids.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x), e -> RecKids.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(x), e -> RecKids.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(x), e -> RecParent.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x), e -> RecParent.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(x), e -> RecParent.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(x),e -> RecAnima1.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecAnim2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecParent2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecParent3.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecKids2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecKids3.setFill(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(x),e -> RecParent2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecParent3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecKids2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecKids3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(x),e -> RecAnim2.setStroke(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(x),e -> circleVer.setFill(Color.valueOf("#EEEFF4"))),

                        new KeyFrame(Duration.seconds(x),e -> label1.setText("..............")),
                        new KeyFrame(Duration.seconds(x),e -> label12.setText("..............")),

                        new KeyFrame(Duration.seconds(x),e -> labelcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(x),e -> labelcard2.setVisible(true)),
                        new KeyFrame(Duration.seconds(x),e -> imgcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(x),e -> imgcard2.setVisible(true)),

                        ///


                        new KeyFrame(Duration.seconds(i), e -> RecParent.setFill(new ImagePattern(image1))),
                        new KeyFrame(Duration.seconds(i), e -> RecParent.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i), e -> RecParent.setStrokeWidth(3.0)),
                       new KeyFrame(Duration.seconds(i), e -> RecKids.setFill(new ImagePattern(image2))),
                        new KeyFrame(Duration.seconds(i), e -> RecKids.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i), e -> RecKids.setStrokeWidth(3.0)),

                        new KeyFrame(Duration.seconds(i),e -> RecAnima1.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecAnim2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecParent2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecParent3.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecKids2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecKids3.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(i),e -> RecParent2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecParent3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecKids2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecKids3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(i),e -> RecAnim2.setStroke(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(i),e -> circleVer.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(i),e -> label1.setText("Mohammed Azer")),
                        new KeyFrame(Duration.seconds(i),e -> label12.setText("M3rfnah chkon")),

                        new KeyFrame(Duration.seconds(i),e -> labelcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(i),e -> labelcard2.setVisible(false)),
                        new KeyFrame(Duration.seconds(i),e -> imgcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(i),e -> imgcard2.setVisible(false)),

                        new KeyFrame(Duration.seconds(i),e -> recfill1.setVisible(true)),
                        new KeyFrame(Duration.seconds(i),e -> circfill1.setVisible(true)),
                        new KeyFrame(Duration.seconds(i),e -> labelfill1.setVisible(true)),
                        new KeyFrame(Duration.seconds(i), e -> circfill1.setFill(new ImagePattern(image2))),
                        new KeyFrame(Duration.seconds(i),e -> labelfill1.setText("M3rfnah chkon")),

                        /////////////////////////////////////////////////////////////////////////////////////////////
                        new KeyFrame(Duration.seconds(j), e -> RecKids.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j), e -> RecKids.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(j), e -> RecKids.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(j), e -> RecParent.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j), e -> RecParent.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(j), e -> RecParent.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(j),e -> RecAnima1.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecAnim2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecParent2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecParent3.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecKids2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecKids3.setFill(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(j),e -> RecParent2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecParent3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecKids2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecKids3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(j),e -> RecAnim2.setStroke(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(j),e -> circleVer.setFill(Color.valueOf("#EEEFF4"))),

                        new KeyFrame(Duration.seconds(j),e -> label1.setText("..............")),
                        new KeyFrame(Duration.seconds(j),e -> label12.setText("..............")),

                        new KeyFrame(Duration.seconds(j),e -> labelcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(j),e -> labelcard2.setVisible(true)),
                        new KeyFrame(Duration.seconds(j),e -> imgcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(j),e -> imgcard2.setVisible(true)),
                        /////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        new KeyFrame(Duration.seconds(k), e -> RecParent.setFill(new ImagePattern(image3))),
                        new KeyFrame(Duration.seconds(k), e -> RecParent.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k), e -> RecParent.setStrokeWidth(3.0)),
                        new KeyFrame(Duration.seconds(k), e -> RecKids.setFill(new ImagePattern(image4))),
                        new KeyFrame(Duration.seconds(k), e -> RecKids.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k), e -> RecKids.setStrokeWidth(3.0)),
                        new KeyFrame(Duration.seconds(k),e -> RecAnima1.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecAnim2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecParent2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecParent3.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecKids2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecKids3.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(k),e -> RecParent2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecParent3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecKids2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecKids3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(k),e -> RecAnim2.setStroke(Color.valueOf("#03975B"))),

                new KeyFrame(Duration.seconds(k),e -> circleVer.setFill(Color.valueOf("#03975B"))),

                new KeyFrame(Duration.seconds(k),e -> label1.setText("Ali Drake")),
                        new KeyFrame(Duration.seconds(k),e -> label12.setText("Yassine Drake")),
                        new KeyFrame(Duration.seconds(k),e -> labelcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> labelcard2.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> imgcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> imgcard2.setVisible(false)),

                        new KeyFrame(Duration.seconds(k),e -> recfill2.setVisible(true)),
                        new KeyFrame(Duration.seconds(k),e -> circfill2.setVisible(true)),
                        new KeyFrame(Duration.seconds(k),e -> labelfill2.setVisible(true)),
                        new KeyFrame(Duration.seconds(k), e -> circfill2.setFill(new ImagePattern(image3))),
                        new KeyFrame(Duration.seconds(k),e -> labelfill2.setText("Yassine Drake")),
///////////////////////////
                        new KeyFrame(Duration.seconds(k),e -> recfill4.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> labelfill4.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> circfill4.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> recdeliv.setVisible(true)),
                        new KeyFrame(Duration.seconds(k),e -> circledeliv.setVisible(true)),
                        new KeyFrame(Duration.seconds(k),e -> labeldeliv.setVisible(true)),
                        new KeyFrame(Duration.seconds(k), e -> circledeliv.setFill(new ImagePattern(image2))),
                        new KeyFrame(Duration.seconds(k),e -> labeldeliv.setText("M3rfnah chkon")),

                        new KeyFrame(Duration.seconds(k), e -> circfill1.setFill(new ImagePattern(image3))),
                        new KeyFrame(Duration.seconds(k),e -> labelfill1.setText("Yassine Drake")),
                        new KeyFrame(Duration.seconds(k),e -> recfill4.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> circfill4.setVisible(false)),
                        new KeyFrame(Duration.seconds(k),e -> labelfill4.setVisible(false)),

                        new KeyFrame(Duration.seconds(k), e -> circfill2.setFill(new ImagePattern(image6))),
                        new KeyFrame(Duration.seconds(k),e -> labelfill2.setText("Soaad Kmni")),

                        new KeyFrame(Duration.seconds(k), e -> circfill3.setFill(new ImagePattern(image8))),
                        new KeyFrame(Duration.seconds(k),e -> labelfill3.setText("M3rfnaha chkon")),
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        new KeyFrame(Duration.seconds(m), e -> RecKids.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m), e -> RecKids.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(m), e -> RecKids.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(m), e -> RecParent.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m), e -> RecParent.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(m), e -> RecParent.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(m),e -> RecAnima1.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecAnim2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecParent2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecParent3.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecKids2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecKids3.setFill(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(m),e -> RecParent2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecParent3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecKids2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecKids3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(m),e -> RecAnim2.setStroke(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(m),e -> circleVer.setFill(Color.valueOf("#EEEFF4"))),

                        new KeyFrame(Duration.seconds(m),e -> label1.setText("..............")),
                        new KeyFrame(Duration.seconds(m),e -> label12.setText("..............")),

                        new KeyFrame(Duration.seconds(m),e -> labelcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(m),e -> labelcard2.setVisible(true)),
                        new KeyFrame(Duration.seconds(m),e -> imgcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(m),e -> imgcard2.setVisible(true)),
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                new KeyFrame(Duration.seconds(n), e -> RecParent.setFill(new ImagePattern(image5))),
                        new KeyFrame(Duration.seconds(n), e -> RecParent.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n), e -> RecParent.setStrokeWidth(3.0)),
                        new KeyFrame(Duration.seconds(n), e -> RecKids.setFill(new ImagePattern(image6))),
                        new KeyFrame(Duration.seconds(n), e -> RecKids.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n), e -> RecKids.setStrokeWidth(3.0)),
                        new KeyFrame(Duration.seconds(n),e -> RecAnima1.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecAnim2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecParent2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecParent3.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecKids2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecKids3.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(n),e -> RecParent2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecParent3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecKids2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecKids3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(n),e -> RecAnim2.setStroke(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(n),e -> circleVer.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(n),e -> label1.setText("Khadija Osne")),
                        new KeyFrame(Duration.seconds(n),e -> label12.setText("Soaad Kmni")),
                        new KeyFrame(Duration.seconds(n),e -> labelcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(n),e -> labelcard2.setVisible(false)),
                        new KeyFrame(Duration.seconds(n),e -> imgcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(n),e -> imgcard2.setVisible(false)),

                        new KeyFrame(Duration.seconds(n),e -> recfill3.setVisible(true)),
                        new KeyFrame(Duration.seconds(n),e -> circfill3.setVisible(true)),
                        new KeyFrame(Duration.seconds(n),e -> labelfill3.setVisible(true)),
                        new KeyFrame(Duration.seconds(n), e -> circfill3.setFill(new ImagePattern(image6))),
                        new KeyFrame(Duration.seconds(n),e -> labelfill3.setText("Soaad Kmni")),
                        //////////////////////////////////////////////////////////////////////////////////
                        new KeyFrame(Duration.seconds(l), e -> RecKids.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l), e -> RecKids.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(l), e -> RecKids.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(l), e -> RecParent.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l), e -> RecParent.setStrokeWidth(1.0)),
                        new KeyFrame(Duration.seconds(l), e -> RecParent.setFill(Color.WHITE)),
                        new KeyFrame(Duration.seconds(l),e -> RecAnima1.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecAnim2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecParent2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecParent3.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecKids2.setFill(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecKids3.setFill(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(l),e -> RecParent2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecParent3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecKids2.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecKids3.setStroke(Color.valueOf("#2e35ea"))),
                        new KeyFrame(Duration.seconds(l),e -> RecAnim2.setStroke(Color.valueOf("#2e35ea"))),

                        new KeyFrame(Duration.seconds(l),e -> circleVer.setFill(Color.valueOf("#EEEFF4"))),

                        new KeyFrame(Duration.seconds(l),e -> label1.setText("..............")),
                        new KeyFrame(Duration.seconds(l),e -> label12.setText("..............")),

                        new KeyFrame(Duration.seconds(l),e -> labelcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(l),e -> labelcard2.setVisible(true)),
                        new KeyFrame(Duration.seconds(l),e -> imgcard1.setVisible(true)),
                        new KeyFrame(Duration.seconds(l),e -> imgcard2.setVisible(true)),
                        ///////////////////////////////////////////////////////////////////////////////////
                        new KeyFrame(Duration.seconds(o), e -> RecParent.setFill(new ImagePattern(image7))),
                        new KeyFrame(Duration.seconds(o), e -> RecParent.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o), e -> RecParent.setStrokeWidth(3.0)),
                        new KeyFrame(Duration.seconds(o), e -> RecKids.setFill(new ImagePattern(image8))),
                        new KeyFrame(Duration.seconds(o), e -> RecKids.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o), e -> RecKids.setStrokeWidth(3.0)),
                        new KeyFrame(Duration.seconds(o),e -> RecAnima1.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecAnim2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecParent2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecParent3.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecKids2.setFill(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecKids3.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(o),e -> RecParent2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecParent3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecKids2.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecKids3.setStroke(Color.valueOf("#03975B"))),
                        new KeyFrame(Duration.seconds(o),e -> RecAnim2.setStroke(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(o),e -> circleVer.setFill(Color.valueOf("#03975B"))),

                        new KeyFrame(Duration.seconds(o),e -> label1.setText("Samia chi7aja")),
                        new KeyFrame(Duration.seconds(o),e -> label12.setText("M3rfnaha chkon")),
                        new KeyFrame(Duration.seconds(o),e -> labelcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(o),e -> labelcard2.setVisible(false)),
                        new KeyFrame(Duration.seconds(o),e -> imgcard1.setVisible(false)),
                        new KeyFrame(Duration.seconds(o),e -> imgcard2.setVisible(false)),

                        new KeyFrame(Duration.seconds(o),e -> recfill4.setVisible(true)),
                        new KeyFrame(Duration.seconds(o),e -> circfill4.setVisible(true)),
                        new KeyFrame(Duration.seconds(o),e -> labelfill4.setVisible(true)),
                        new KeyFrame(Duration.seconds(o), e -> circfill4.setFill(new ImagePattern(image8))),
                        new KeyFrame(Duration.seconds(o),e -> labelfill4.setText("M3rfnaha chkon"))
                );

                timeline.play();}

        }, 0, 18000);
*/




    }
    @FXML
    void closme(MouseEvent event) throws IOException {

        ((Node) event.getSource()).getScene().getWindow().hide();

    }
protected void card1(){
    RecParent.setFill(new ImagePattern(image1));
    RecKids.setFill(new ImagePattern(image2));
    label1.setText("Mohamed Alian");
    label12.setText("Saad Alian");

    //////// File D'attente
    recfill1.setVisible(true);
    circfill1.setVisible(true);
    labelfill1.setVisible(true);
    circfill1.setFill(new ImagePattern(image2));
    labelfill1.setText("Saad Alian");


}
protected void Card2(){
    RecParent.setFill(new ImagePattern(image4));
    RecKids.setFill(new ImagePattern(image3));
    label1.setText("Brahim Crmef");
    label12.setText(" Ahmad Crmef");

    //////// File D'attente
    recfill2.setVisible(true);
    circfill2.setVisible(true);
    labelfill2.setVisible(true);
    circfill2.setFill(new ImagePattern(image3));
    labelfill2.setText("Ahmed Crmef");
}

    protected void Card3(){
        RecParent.setFill(new ImagePattern(image5));
        RecKids.setFill(new ImagePattern(image6));
        label1.setText("Khadija Hakimi");
        label12.setText("Salma Rafik");

        //////// File D'attente
        recfill3.setVisible(true);
        circfill3.setVisible(true);
        labelfill3.setVisible(true);
        circfill3.setFill(new ImagePattern(image6));
        labelfill3.setText("Salma Rafik");


        recdeliv.setVisible(true);
                 circledeliv.setVisible(true);
                labeldeliv.setVisible(true);
                 circledeliv.setFill(new ImagePattern(image2));
                 labeldeliv.setText("Saad Alian");
    }

    protected void Card4(){
        RecParent.setFill(new ImagePattern(image7));
        RecKids.setFill(new ImagePattern(image8));
        label1.setText("Samia Cisco");
        label12.setText("Ala Child");

        //////// File D'attente
        recfill4.setVisible(true);
        circfill4.setVisible(true);
        labelfill4.setVisible(true);
        circfill4.setFill(new ImagePattern(image8));
        labelfill4.setText("Ala Child");
    }


    protected void toGreen(){

           RecParent.setStroke(Color.valueOf("#03975B"));
              RecParent.setStrokeWidth(3.0);
         RecKids.setStroke(Color.valueOf("#03975B"));
               RecKids.setStrokeWidth(3.0);

      RecAnima1.setFill(Color.valueOf("#03975B"));
               RecAnim2.setFill(Color.valueOf("#03975B"));
                 RecParent2.setFill(Color.valueOf("#03975B"));
             RecParent3.setFill(Color.valueOf("#03975B"));
              RecKids2.setFill(Color.valueOf("#03975B"));
               RecKids3.setFill(Color.valueOf("#03975B"));

              RecParent2.setStroke(Color.valueOf("#03975B"));
               RecParent3.setStroke(Color.valueOf("#03975B"));
              RecKids2.setStroke(Color.valueOf("#03975B"));
                RecKids3.setStroke(Color.valueOf("#03975B"));
            RecAnim2.setStroke(Color.valueOf("#03975B"));

          circleVer.setFill(Color.valueOf("#03975B"));



              labelcard1.setVisible(false);
                labelcard2.setVisible(false);
                 imgcard1.setVisible(false);
                imgcard2.setVisible(false);


    }


    public Rectangle getRecParent(){
        return this.RecParent;
    }



}
