import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DBConnectorTest {

    @org.junit.Test
    public void getConnection() {
        try {
            Connection connection = DBConnector.getConnection();
            System.out.println(connection.getClientInfo());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}