import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData2 {
    public static void main(String[] args) {
        String connectionUrl =
        "jdbc:sqlserver://DESKTOP-R4SSJVI\\SQLEXPRESS;databaseName=mydb;user=sa;password=Nagaraju8!";
        System.out.println("Connection Established with SQL Server");

        try (Connection con = DriverManager.getConnection(connectionUrl);
                Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 5 * FROM STUDENTS;";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
