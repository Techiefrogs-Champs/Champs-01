package p;

class Students{
    int roll_no;
    int phone;
    String name;
    String address;
}

public class info1 {
    public static void main(String[] args) {
        Students s = new Students();
        Students s1 = new Students();
        s.name = "SAM";
        s.roll_no = 21;
        s.phone = 91403246;
        s.address = "XYS STREET";
        
        s1.name = "JHON";
        s1.roll_no = 22;
        s1.phone = 23232536;
        s1.address = "ABC STREET";
    System.out.println("NAME OF STUDENT "+s.name+" ROLL_NO OF STUDENT "+s.roll_no+" PHONE OF STUDENTS "+s.phone+" ADD OF STUDENT "+s.address);
    System.out.println("NAME OF STUDENT "+s1.name+" ROLL_NO OF STUDENT "+s1.roll_no+" PHONE OF STUDENTS "+s1.phone+" ADD OF STUDENT "+s1.address);
    
    }

}