package group1.rfid;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Alert;


public class Conclass {
    public Connection con;
    public  Connection getConnection(){



                String url="jdbc:mysql://localhost:7882/rfid"+"root"+"root";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");


        }catch (ClassNotFoundException e){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setTitle("PAEASISE INFORMATION");
            alert.setHeaderText(null);
            alert.setContentText("ERROR DANS LE DRIVER DE CONNEXION !!");
            alert.showAndWait();    }

        try{
            con = DriverManager.getConnection(url);

        }catch(SQLException ee){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setTitle("PAEASISE INFORMATION");
            alert.setHeaderText(null);
            alert.setContentText(ee.toString());
            alert.showAndWait();
        }
        return con;
    }


}
