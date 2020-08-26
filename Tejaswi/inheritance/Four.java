class Rectangle
{
    int length;
    int breadth;
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
   void Area()
    {
        System.out.println(length * breadth);
    }
  void Perimeter()
   {
        System.out.println(2 * (length + breadth));
    }
}
class Square extends Rectangle
{
int  s;
Square(int s)
{
super(s,s);
}
}
class Four
{
    public static void main(String arg[])
    {
Rectangle rt=new Rectangle(3,4);
rt.Area();
rt.Perimeter();
       Square sq = new Square(8);
        sq.Area();
sq.Perimeter();
}
}