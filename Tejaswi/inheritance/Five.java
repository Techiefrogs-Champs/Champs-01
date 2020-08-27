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
class Five
{
    public static void main(String arg[])
    {
Rectangle rt=new Rectangle(3,4);
rt.Area();
rt.Perimeter();
       Square sq = new Square(8);
        sq.Area();
         sq.Perimeter();
    Square[] a = new Square[10];
    int k = 5;
    for(int i = 0;i<10;i++)
{
      a[i] = new Square(k);
      k++;
    }
    for(int i = 0;i<10;i++)
{
      a[i].Area();
      a[i].Perimeter();
    }
}
 }
