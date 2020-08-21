class Area{
  public static void printArea(int l,int b){
    System.out.println(l*b);
  }
  public static void printArea(int a){
    System.out.println(a*a);
  }
}
class Cal
{
public static void main(String args[])
{
Area ar=new Area();
ar.printArea(5,7);
ar.printArea(4);
}
}