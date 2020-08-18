package src.AbstractExce;

abstract class Mark
{
 abstract double getPercentage();
}
class classA extends Mark
{
        double result;
        classA( int a, int b, int c)
        {
        result=(a+b+c)/3;
        }
        double getPercentage()
        {
        return result;
        }
}
class classB extends Mark
{
        double result;
        classB(int a, int b, int c, int d)
        {
        result=(a+b+c+d)/4;
        }
        double getPercentage()
        {
        return result;
        }
}
class Main
{
 public static void main(String args[])
 {

  Mark obj_1=new classA(10,20,30);
  System.out.println(obj_1.getPercentage());
  Mark obj_2=new classB(10,20,38,46);
  System.out.println(obj_2.getPercentage());
 }
}