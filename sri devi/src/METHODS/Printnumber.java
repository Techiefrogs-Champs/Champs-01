package METHODS;

public class Printnumber {
     
  

  
 public void print(  int n){ 

   

     System.out.println("number of candidate is" +n);

 } 
   public void print( String n){ 

  
    System.out.println(" name of the candidate is" +" "+n);

   }
   

 public static void main(String[] args) {
       
    Printnumber obj=new Printnumber( );
    obj.print( 45);
    obj.print("sita");
 }




}