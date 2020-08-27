package Inheritance;
class Student
{
    void name()
    {
        System.out.println("Soumya");
    }
}
class Year extends Student{
    void msg()
    {
        System.out.println("4th year");
    }
}
class Rollno extends Student
{
    void num()
    {
        System.err.println("7012");
    }
}
public class Herarichal {
    public static void main(String args[])
    {
        Rollno r= new Rollno();
        r.num();
        r.name();
        Year y=new Year();
        y.msg();
        y.name();
    }
}