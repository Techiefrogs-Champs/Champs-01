import java.util.*;
class Area
{
  int length;
  int breadth;
  public Area(int l, int b)
{
    length = l;
    breadth = b;
  }
  public int getArea()
{
    return length*breadth;
  }
}
class Seven
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
{
    int len,bre;
    System.out.println("Enter length");
    len= s.nextInt();
    System.out.println("Enter breadth");
    bre = s.nextInt();
   Area a = new Area(len,bre);
   System.out.println("Area is: "+a.getArea());
  }
}
}