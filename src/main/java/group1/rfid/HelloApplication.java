package group1.rfid;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;




public class HelloApplication extends Application  {
//.....
    //commit
private double xOffset = 0;
private double yOffset = 0;

    @Override
    public void start(Stage stage) throws IOException {

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




    }



    public static void main(String[] args) {
        launch();
    }
}

