package CodesDope;

class Stud1
{
    String name,address;
    int rollno,phno;
}
class Stud2
{
    String name,address;
    int rollno,phno;
}
public class Exe2 
{
    public static void main(String[] args)
    {
    Stud1 st1=new Stud1();
    Stud2 st2=new Stud2();
    st1.name="Sam";
    st1.address="Banglore";
    st1.rollno=7012;
    st1.phno=12345;
    st2.name="John";
    st2.address="Hyderabad";
    st2.rollno=7013;
    st2.phno=123456;
    System.out.println(st1.name);
    System.out.println(st1.rollno);
    System.out.println(st1.phno);
    System.out.println(st1.address);
    System.out.println(st2.name);
    System.out.println(st2.rollno);
    System.out.println(st2.phno);
    System.out.println(st2.address);
    }

}