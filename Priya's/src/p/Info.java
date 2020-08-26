package p;

class Student{
    int roll_no;
    String name;
}

public class Info{
    
public static void main(String[] args) {
    Student s = new Student();
    s.roll_no = 2;
    s.name = "JOHN";

System.out.println("NAME OF THE STUDENT IS :- "+s.name);
System.out.println("ROLL_NO OF THE STUDENT IS :-"+s.roll_no);
}
}