package inheritance;


class homosapiens{

    int score;
    String name="sita";
   void simple(){   
 
 System.out.println(" welcome sapiens");
   }
 }    
 
 class humans extends homosapiens{ 
 
    int num=56; 
    String systems;
     void perform(){ 
 
 System.out.println("hi humans");
 
    }
 
 }
 
    public class Chocolates{  
 
     public static void main(String[] args) {
      humans obj1=new humans();
      obj1.simple();
      obj1.perform();
      
    
    } 

    }









    
