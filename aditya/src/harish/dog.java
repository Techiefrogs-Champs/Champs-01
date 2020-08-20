package harish;

 class Animal{
    void eat(){
        System.out.println("eating");
    }
}
  public class dog extends Animal{
      void bark(){
          System.out.println("barking");
     }
     public static void main(String []args){
         dog obj=new dog();
         obj.eat();
         obj.bark();
     }
  }
