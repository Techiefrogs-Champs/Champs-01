//overriding a protected method, so compile time error
package AccessModifiers;

class Simple3{  
    protected void msg4(){
      System.out.println("Hello java");}  
    }  
      
    public class Simple4 extends Simple3{  
    void msg4(){
        System.out.println("Hello java");}
     public static void main(String args[]){  
       Simple4 obj=new Simple4();  
       obj.msg4();  
       }  
    }  