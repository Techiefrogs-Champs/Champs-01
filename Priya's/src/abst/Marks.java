package abst;

abstract class Mark
{
 abstract double getPercentage();
}
class A extends Mark
{
 double result;
 A( int a, int b, int c)
 {
  result=(a+b+c)/3;
 }
 double getPercentage()
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
 double getPercentage()
 {
  return result;
 }
}
class result
{
 public static void main(String args[])
 {
  
  Mark obj1=new A(10,25,36);
  System.out.println(obj1.getPercentage());
  
  Mark obj2=new B(16,20,38,46);
  System.out.println(obj2.getPercentage());
 }
}