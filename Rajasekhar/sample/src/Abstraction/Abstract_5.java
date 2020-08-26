/*Q-5). Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' 
with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. 
Now create an object for each of the subclasses and call their respective methods. */


package src.Abstraction;

abstract class Animals{
    abstract void sound();
  }
 
  class Dogs extends Animals{
  void sound(){
   System.out.println("Dogs bark");
   }
  }
  class Cats extends Animals{
  void sound(){
   System.out.println("Cats meow");
   }
  }
  class Abstract_5{
  public static void main(String[] args){
   Animals d = new Dogs();
   Animals c = new Cats();
   d.sound();
   c.sound();
  }
 }