package abst;

abstract class shapes
{
 abstract double RectangleArea(double length, double breadth);
 abstract double SquareArea(double side);
 abstract double CircleArea(double radius);
}
class Area extends shapes
{
 double RectangleArea(double length, double breadth)
 {
  return length*breadth;
 }
 double SquareArea(double side)
 {
  return side*side;
 }
 double CircleArea(double radius)
 {
  return 3.14*radius*radius; 
 }
}
class Areas
{
 public static void main(String args[])
 {
  Area obj=new Area();
  double rect=obj.RectangleArea(15,25);
  double squr=obj.SquareArea(rect);
  double circ=obj.CircleArea(squr);
  System.out.println("Rectangle Area: "+rect);
  System.out.println("Square Area: "+squr);
  System.out.println("Circle Area: "+circ);
 }
}
