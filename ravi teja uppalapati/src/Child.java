
 class Paraent
{
    void walk(){System.out.println("walk");}


 void display(){
     System.out.println("This is parent class");
 }   }
 public class Child extends Paraent{
  void eat(){System.out.println("eat");}
 void display(){
     System.out.println("This is child class");
 }
 public static void main(String[] args) {
Child obj=new Child();
obj.walk();
obj.eat();
obj.display();
 obj.display();    
 }}
 
