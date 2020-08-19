

//We have to calculate the area of a rectangle, a square and a circle. 
//Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' 
//taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
//The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' 
//is its side and that of 'CircleArea' is its radius. 
//Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' 
//and 'CircleArea' for printing the area of rectangle, square and circle respectively. 
//Create an object of class 'Area' and call all the three methods.

abstract class shape
{
 abstract double RectangleArea(double length, double breadth);
 abstract double SquareArea(double side);
 abstract double CircleArea(double radius);
}
class Area extends shape
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
class Main6
{
 public static void main(String args[])
 {
  Area obj=new Area();
  double rect=obj.RectangleArea(10,20);
  double squr=obj.SquareArea(rect);
  double circ=obj.CircleArea(squr);
  System.out.println("Rectangle Area: "+rect);
  System.out.println("Square Area: "+squr);
  System.out.println("Circle Area: "+circ);
 }
}
