public class CRUD {
   public static void main(String[] args) {
       
   } 
}
/*
Retrive Data:
Statement stmt = con.createSatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");
while(rs.next())
    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
=========

Insert Data:
PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?)");
ps.setString(1, "104");
ps.setString(2, "Raj");
ps.setString(3, "Chennai");
ps.setString(4, "5555555555");
ps.executeUpdate();
=========

Update Data:
PreparedStatement ps = con.prepareStatement("UPDATE STUDENTS SET NAME = ? WHERE ROLLNUM = ?");
ps.setString(1, "Soumya");
ps.setString(2, "102");
ps.executeUpdate();

*/