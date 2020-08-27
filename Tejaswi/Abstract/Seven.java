import java.util.*;
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
class Seven
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  Area obj=new Area();
  double rect[]=new double[4];
  for(int i=0;i<4;i++)
  {
   System.out.print("Enter Rectangle value "+(i+1)+": ");
   rect[i]=obj.RectangleArea(s.nextDouble(),s.nextDouble());
  }
  System.out.println("------------");
  for(int i=0;i<4;i++)
   System.out.println((i+1)+". Area of Rectangle: "+rect[i]);
  System.out.println("------------");
  double squ[]=new double[4];
  for(int i=0;i<4;i++)
  {
   squ[i]=obj.SquareArea(rect[i]);
  }
  for(int i=0;i<4;i++)
   System.out.println((i+1)+". Area of Square: "+squ[i]);
  System.out.println("------------");
  double circ[]=new double[4];
  for(int i=0;i<4;i++)
  {
   circ[i]=obj.CircleArea(squ[i]);
  }
  for(int i=0;i<4;i++)
   System.out.println((i+1)+". Area of Circle: "+circ[i]);
 }
}