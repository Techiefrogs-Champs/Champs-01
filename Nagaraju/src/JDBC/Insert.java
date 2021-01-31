import java.sql.*;

class Insert{
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:sqlserver://DESKTOP-R4SSJVI\\SQLEXPRESS;databaseName=mydb;user=sa;password=Nagaraju8!");
            System.out.println("Connection Established");

        PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?)");
        ps.setString(1, "104");
        ps.setString(2, "Raj");
        ps.setString(3, "Chennai");
        ps.setString(4, "5555555555");
        ps.executeUpdate();

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");
        while(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
    }
}
