//Defult modifier can access only with in the package, so compile time error
package AccessModifiers.p2;
import AccessModifiers.p1.*;
class Student 
{ 
    public static void main(String args[]) 
       {   
          Techie obj = new Techie(); 
  
          obj.display(); 
       } 
} 