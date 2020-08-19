package invisible;

  abstract class shape{
    int l=4;
    int b=5;
    int s=12;
    int r=8;
    abstract void rectangleArea();
    abstract void squareArea();
    abstract void circleArea();
  }

   class Area extends shape {

     public void rectangleArea( ){
       
    
      System.out.println( "area of rectangle is"+(l*b)); 
  
     }

      public void squareArea( ){

       
       System.out.println("area of square is"+(s*s));
      } 
      public void circleArea( ){

      
       System.out.println("area of circle is"+(r*r));
      }

   }

public class Stamp {

  public static void main(String[] args) {
    shape obj=new Area();
   obj.rectangleArea();
    obj.squareArea();
    obj.circleArea();
  }
    
}