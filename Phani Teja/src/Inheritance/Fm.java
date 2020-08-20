package Inheritance;

class Grandma
{
    void great(){
    System.out.println("My grandma");
    }
}
class Mom extends Grandma
{
    void daughter()
    {
        System.out.println("My mom");
    }
}
class Teja extends Mom
{
    void son()
    {
        System.out.println("This is Teja");
    }
}
public class Fm {
    public static void main(String args[])
    {
        Teja t=new Teja();
        t.son();
        t.daughter();
        t.great();
    }
}