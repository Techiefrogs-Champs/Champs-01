package Inheritance;
class Rectangle{
    int length,bredth;
   void area(){
        System.out.println( length*bredth);
    }
    void perimeter(){
        System.out.println(2*(length+bredth));
    }
    Rectangle(int l,int b){
        length=l;
        bredth=b;
    }
}
class Square extends Rectangle{
    int side;
    public Square(int s){
      super(s,s);
    }
}
public class Excercise_4 extends Rectangle {
    public static void main(String[] args){
        Rectangle r=new Rectangle(4,5);
        r.area();
        r.perimeter();
        Square s= new Square(8);
        s.area();
        s.perimeter();

    }
    
    
}