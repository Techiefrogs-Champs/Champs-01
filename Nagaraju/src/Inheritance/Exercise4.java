/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print 
the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth
 is used to initialize length and breadth of the rectangle. Let class 'Square' inherit 
 the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling 
 the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and 
 a square.*/

 class Rectangle{
     int length,bredth;
     public Rectangle(int l,int b){
         length=l;
         bredth=b;
     }
    void area(){
         System.out.println( length*bredth);
     }
     void perimeter(){
         System.out.println(2*(length+bredth));
     }
 
 }
 class Squar extends Rectangle{
     int side;
     public Squar(int s){
       super(s,s);
     }
 }
 public class Exercise4 extends Rectangle {
     public Exercise4(int l, int b) {
         super(l, b);
     }

     public static void main(String[] args) {
         Rectangle r=new Rectangle(4,5);
         r.area();
         r.perimeter();
         Squar s= new Squar(8);
         s.area();
         s.perimeter();
 
     }
     
     
 }