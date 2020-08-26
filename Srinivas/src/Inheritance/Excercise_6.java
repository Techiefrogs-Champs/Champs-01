package Inheritance;
class Shape{
    void smsg(){
        System.out.println("This shape is");
    }
}
class Rectang extends Shape{
    void Rmsg(){
        System.out.println("Rectangle shape");
    }
}

class Circle extends Shape{
    void Cmsg(){
        System.out.println("Circle shape");
    }
}
class Squar extends Rectang {
    void Smsg(){

        System.out.println("square is rectangle");
    }
}
public class Excercise_6{
    public static void main(String[] args)
    {
        Squar s=new Squar();
        s.smsg();
        s.Rmsg();

    }
}
    
     
    
