
//Create an abstract class 'Parent' with a method 'message'. 
//It has two subclasses each having a method with the same name 'message' 
//that prints "This is first subclass" and "This is second subclass" respectively. 
//Call the methods 'message' by creating an object for each subclass.

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
class Main
{
 public static void main(String args[])
 {
  Parent obj_1=new Child_1();
  obj_1.message();
  Parent obj_2=new Child_2();
  obj_2.message();
 }
}