class Rectangle
{
    double length;
    double breadth;
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
   int getArea()
    {
        return length * breadth;
    }
  int getPerimeter()
   {
        return 2 * (length + breadth);
    }
}
class Square Extends Rectangle
{
   int getArea()
    {
        return length* breadth;
    }
  int getPerimeter()
   {
        return 2 * (length + breadth);
    }
super(length,breadth);
}
class Areaofrectagnle
{
    public static void main(String arg[])
    {
        Rectangle rect = new Rectangle(10, 5);
        
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        }
}