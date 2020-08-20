
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
  class Main5{
  public static void main(String[] args){
   Animals d = new Dogs();
   Animals c = new Cats();
   d.sound();
   c.sound();
  }
 }