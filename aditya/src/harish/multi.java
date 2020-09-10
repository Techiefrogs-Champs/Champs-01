package harish;

class Animal {
    void eat(){
        System.out.println("eating");
    }
}
   class Dog extends Animal{
      void bark(){
          System.out.println("barking");
     }
    }
    class lion extends Animal{
        void roars(){
            System.out.println("roaring");
        }
    }
    public class multi{
     public static void main(String []args){
         lion obj=new lion();
         dog obj1=new dog();
         obj.eat();
         obj1.eat();
        
     }
    }