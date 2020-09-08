package typecasting;//downcasting


class pro8 { }  
  
class Dog3 extends pro8 {  
  static void method(pro8 a) {  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
    pro8 a=new Dog3();  
    Dog3.method(a);  
  }  
    
 }  

    
