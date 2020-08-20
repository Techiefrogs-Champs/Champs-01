package abst;

abstract class Animals{
    abstract void cats();
    abstract void dogs();
  }
 
  class Dogs extends Animals{
  void dogs(){
   System.out.println("DOGS BARK");
   }

   @Override
   void cats() {

   }
  
  }
  class Cats extends Animals{
  void cats(){
   System.out.println("CATS MEOW");
   }

   void dogs() {
     

   }

   
  }
  class Main5{
  public static void main(String[] args){
   Animals obj = new Dogs();
   Animals obj1 = new Cats();
   obj.cats();
   obj1.dogs();
  }
 }