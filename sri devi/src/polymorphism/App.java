package polymorphism;


 class same{

  void simple(){ 

System.out.println("my name is");

 }
 }

  class display extends same{ 

   void simple(){ 
  System.out.println("today is holiday");
  }
  }
public class App {
     
    public static void main(String[] args) {
        
    
 display obj=new display();   

  obj.simple();
    }
}