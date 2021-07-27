import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mensajes_App {

    public  static Connection get_Conexion(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
        if (connection !=null){
            System.out.println("Conexion Exitosa");
        }
        }catch (SQLException e){
            System.out.println(e);
        }
    return connection;
    }
}
