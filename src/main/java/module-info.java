module group1.rfid {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires webcam.capture;
    requires kong.java.client;
    requires java.datatransfer;
    requires java.desktop;
    requires javafx.swing;
    requires com.google.zxing;
    //requires zxing.javase;
    requires javafx.media;
    requires com.google.zxing.javase;
    requires AbsoluteLayout.RELEASE126;
    requires sentry;


    opens group1.rfid to javafx.fxml;
    exports group1.rfid;
}