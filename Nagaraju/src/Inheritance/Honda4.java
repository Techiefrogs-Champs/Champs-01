package Inheritance;
abstract class Bike{  
      abstract void run();  
    }  
    class Hero extends Bike {
    void run(){System.out.println("running not safely");}    
    }
    class Honda4 extends Bike{  
    void run(){System.out.println("running safely");}  
    public static void main(String args[]){  
     Bike obj = new Honda4();
    Bike obj1 = new Hero();  
     obj.run(); 
    obj1.run(); 
    }  
    } 