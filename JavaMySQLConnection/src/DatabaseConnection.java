import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed! " + e.getMessage());
        }
    }
}