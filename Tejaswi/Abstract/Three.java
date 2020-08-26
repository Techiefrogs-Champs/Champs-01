abstract class Mark
{
 abstract double Percentage();
}
class A extends Mark
{
 double result;
 A( int a, int b, int c)
 {
  result=(a+b+c)/3;
 }
 double Percentage()
 {
  return result;
 }
}
class B extends Mark
{
 double result;
 B(int a, int b, int c, int d)
 {
  result=(a+b+c+d)/4;
 }
 double Percentage()
 {
  return result;
 }
}
class Three
{
 public static void main(String args[])
 {
  Mark obj1=new A(10,20,30);
  System.out.println(obj1.Percentage());
  Mark obj2=new B(40,50,78,43);
  System.out.println(obj2.Percentage());
 }
}