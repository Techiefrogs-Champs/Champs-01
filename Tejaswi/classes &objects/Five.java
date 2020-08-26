class Rectangle{
  int length;
  int breadth;
 Rectangle(int l, int b){
    length = l;
    breadth = b;
  }
 int area()
{
    return length*breadth;
  }
 int perimeter(){
    return 2*(length+breadth);
  }
}
class Five
{
  public static void main(String[] args)
{
    Rectangle r1 = new Rectangle(4,5);
    Rectangle r2= new Rectangle(5,8);
    System.out.println(" area and perimeter of rect1 is"+r1.area()+"and"+r1.perimeter());
    System.out.println(" area and perimeter of rect2 is"+r2.area()+"and"+r2.perimeter());
  }
}