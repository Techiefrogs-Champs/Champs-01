package absracts;
abstract class Shape {
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
    }
    class Area{
       public int RectangleArea(int length,int breadth){
            return length*breadth;
        }
       public int SquareArea(int side){
           return side*side;
       }
       public int CircleArea(int radius){
           return radius*radius;
       }
    }   
     class abs6{
         public static void main(String []args){
             Area obj1=new Area();
            System.out.println( obj1.RectangleArea(4,7));
            System.out.println(obj1.SquareArea(7));
            System.out.println(obj1.CircleArea(8)); 
        }
     }