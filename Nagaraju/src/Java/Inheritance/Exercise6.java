/* Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes 
named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print 
"This is rectangular shape" and "This is circular shape" respectively. Create a subclass 
'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 
'Shape' and 'Rectangle' class by the object of 'Square' class. */

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
class Square extends Rectang {
    void Smsg(){
        System.out.println("square is rectangle");
    }
}
public class Exercise6{
    public static void main(String[] args){
        Square s=new Square();
        s.smsg();
        s.Rmsg();
    }
}