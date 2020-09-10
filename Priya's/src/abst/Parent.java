package abst;

abstract class Parent
{
 abstract void message();
}
class Child1 extends Parent
{
 void message()
 {
  System.out.println("THIS IS FIRST SUBCLASS");
 }
}
class Child2 extends Parent
{
 void message()
 {
  System.out.println("THIS IS SECOND SUBCLASS");
 }
}
class Main
{
 public static void main(String args[])
 {
  Parent obj=new Child1();
  obj.message();
  Parent obj1=new Child2();
  obj1.message();
 }
}