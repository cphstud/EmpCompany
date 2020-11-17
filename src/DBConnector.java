import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static Connection connection = null;

    private static String user = "root";
    private static String password = "root123";
    private static String db = "EMP";
    private static String url = "jdbc:mysql://localhost:3306/"+db+"?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";

    private DBConnector () {

    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
        connection = DriverManager.getConnection(url,user,password);
        }
        return connection;
    }
}
