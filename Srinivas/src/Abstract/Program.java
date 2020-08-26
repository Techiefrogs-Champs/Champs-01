package Abstract;
abstract class Parent
{
 abstract void message();
}
class Child_1 extends Parent
{
 void message()
 {
  System.out.println("This is first subclass");
 }
}
class Child_2 extends Parent
{
 void message()
 {
  System.out.println("This is second subclass");
 }
}
class Program
{
 public static void main(String args[])
 {
  Parent obj_1=new Child_1();
  obj_1.message();
  Parent obj_2=new Child_2();
  obj_2.message();
 }
}