//Private Constructor, So compile time error
package AccessModifiers;

class A{  
    private A(){} 
    void msg1(){System.out.println("Hello java");}  
    }  
public class Simple2{  
public static void main(String args[]){  
    A obj=new A(); 
     }  
    }