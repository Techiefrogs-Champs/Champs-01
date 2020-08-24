package Inheritance;

class Dad
{
    void father(){
    System.out.println("My Dad");
    }
}
class Soumya extends Dad
{
    void daughter()
    {
        System.out.println("Hi,This is Soumya");
    }
}
public class Family {
    public static void main(String args[])
    {
        Soumya s=new Soumya();
        s.father();
        s.daughter();
    }
}