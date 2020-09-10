package Interface;

class Shape{
    void display()
    {
        System.out.println("This is shape");
    }
}
class Rectanglee extends Shape
{
    public void dis()
    {
        System.out.println("This is rectangular shape");
    }
    void square()
    {
        System.out.println("square is a rectangle");
    }
}
class Circle extends Shape
{
    void disp()
    {
        System.out.println("This is Circular shape");
    }
}
public class Interexe6 {
    public static void main(String[] args){
    
        Rectanglee s= new Rectanglee();
        s.dis();
        s.square();
    }
    
}