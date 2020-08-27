abstract class Parent
{
 abstract void message();
}
class Child extends Parent
{
 void message()
 {
  System.out.println("This is first subclass");
 }
}
class Child1 extends Parent
{
 void message()
 {
  System.out.println("This is second subclass");
 }
}
class One
{
 public static void main(String args[])
 {
  Parent P=new Child();
  P.message();
 Parent P1=new Child1();
  P1.message();
 }
}