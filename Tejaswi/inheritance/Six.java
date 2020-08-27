class Shape
{
void shape()
{
System.out.println("this is shape");
}
}
class Rectangle extends Shape
{
void rectangle()
{
System.out.println("this is rectangle");
}
}
class Square extends Rectangle
{
void square()
{
System.out.println("square is rectangle");
}
}
class Six
{
public static void main(String args[])
{
Square s= new Square();
s.shape();
s.rectangle();
}
}
