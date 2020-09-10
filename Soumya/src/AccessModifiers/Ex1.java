package AccessModifiers;

class Stud
{
    String name;
    int rollno;
}
public class Ex1 {
    public static void main(String[] args)
    {
        Stud s=new Stud();
        s.name="john";
        s.rollno=2;
        System.out.println(s.name);
        System.out.println(s.rollno);
    }
}