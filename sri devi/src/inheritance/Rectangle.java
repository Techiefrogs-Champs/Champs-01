package inheritance;
  class Rhombus {
     int l;
     int b;
    Rhombus( int length,int breadth){

     l=length;
     b= breadth; }

      public void same(){
        System.out.println( "area of rectangle is"+" "+(l*b ));}
          
       public void name(){

         System.out.println("perimeter of rectangle is"+" "+2*(l+b));

     }

    }


  class Square extends Rhombus{
     int side;
     Square  (int s){

     super(s,s);

  }
}

public class Rectangle {
     public static void main(String[] args) {
         
     
Rhombus obj=new Rhombus(3,7);

 obj.name();
 obj.same();  

Square obj1=new Square(12);
  obj1.same();}
}