/*4.	Java Program to Handle Exception Using Throws KeyWord*/
package Exception_1;
import java.io.IOException;  

public class Using_Throws {
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){
       System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
    Using_Throws obj=new Using_Throws();  
   obj.p();  
   System.out.println("normal flow...");  
  }  

    
}