package invisible;

  abstract class Animals{

     abstract void cats();

     abstract void dogs();
  }
  class Cat extends Animals{

    void cats(){

   System.out.println("cats meow");

    }
  
   void dogs(){

   }
  }

 class Dog extends Animals{

    void cats(){
      
    }
     void dogs(){

     System.out.println("dogs bark");

     }
 }

public class Lamp {
       
   public static void main(String[] args) {
     
    Animals obj=new Cat();
     Animals obj1=new Dog();

   obj.cats();
   obj1.dogs();

   }


}