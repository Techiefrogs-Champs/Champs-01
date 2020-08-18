package src.Method;

abstract class abstractDemo {  

    abstract void display();
    abstract void display1();
    abstract void display2();
   

    public int ID = 24;
    public String fname = "Ravi";
    public String lname = "Teja";

   
    public void regularMethod() { //non-abstract method
        System.out.println("This is RegularMethod");
    }

} 

public class AbstractMethod extends abstractDemo  
{   
    void display(){  
        System.out.println("This is Abstract method:");  
    } 

    void display1(){  
        int a =100;
        int b =200;
        System.out.println(a+b);  
    }

    void display2(){  
        if(!true){
            return;
        } else {
        int i = 10;
            System.out.println(i); 
        }
    } 


        public static void main(String args[])  
        {  

        AbstractMethod obj = new AbstractMethod();  
        System.out.println("ID: " + obj.ID);
        System.out.println("Name: " + obj.fname);
        System.out.println("Name: " + obj.lname);

        obj.display(); 
        obj.regularMethod();
        obj.display1();
        obj.display2();
      
    }
}