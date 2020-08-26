package inheritance;

    class jasmine{
       void smell(){ 

        System.out.println("This is parent class");

       }
    }

     class marigold extends jasmine{ 

      void fragrance(){ 

      System.out.println("This is child class");
      }
     }
public class Scent {
  public static void main(String[] args) {
      
     
 jasmine obj=new jasmine();
 marigold obj1=new marigold();
  
  obj.smell();
  obj1.fragrance();
  obj1.smell();
  }

}