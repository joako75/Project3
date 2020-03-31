package cop2805;
import java.sql.*;

//Class used for database connection, allowing for the database to be saved to memory and persist.
//Information gathered from https://db.apache.org/derby/docs/10.6/devguide/cdevdvlpinmemdb.html
//and https://www.codejava.net/java-se/jdbc/connect-to-a-database-with-jdbc
public class DBConnect {
	public static void main(String[] args) {
        String dbURL = "jdbc:derby:memory:indexDB;create=true";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Index database - Connected");
            }
        } catch (SQLException ex) {
            System.out.println("An error has occured. Please try again.");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
	}
}