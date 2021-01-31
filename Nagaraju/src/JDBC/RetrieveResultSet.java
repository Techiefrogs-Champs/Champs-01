import java.sql.*;

class RetrieveResultsSet{
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:sqlserver://DESKTOP-R4SSJVI\\SQLEXPRESS;databaseName=mydb;user=sa;password=Nagaraju8!");
            System.out.println("Connection Established");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");
        while(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
    }
}