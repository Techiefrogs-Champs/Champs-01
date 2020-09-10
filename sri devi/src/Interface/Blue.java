package Interface;

 class black implements Red{

public void show(){
 
    System.out.println("this is another package");
 
    }
   public void normal(){
 
 
     System.out.println("method 2"); 
   }
   public void distance(){
 
   System.out.println("this is method 3");
 
   }
}
public class Blue  {
    public static void main(String[] args) {
        
    
   black obj=new black();

   obj.normal();
   obj.show();
   obj.distance();

    }

 }