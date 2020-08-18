package src.InheritanExce;


class Shape1{
    public void shape1(){
        System.out.println("This is This is shape");
    }
}
class Rectangle extends Shape1{
    public void Rectangle(){
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape1{
    public  void Circle(){
        System.out.println("This is circular shape");
    }
}

class Square1 extends Rectangle{
    public void Square1(){
        System.out.println("Square is a rectangle");
    }
}
public class Shape {
    public static void main(String[] args){
        Square1 s=new Square1();
        s.Square1();
    }

    
}