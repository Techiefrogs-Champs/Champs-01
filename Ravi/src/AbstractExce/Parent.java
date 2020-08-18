package src.AbstractExce;

abstract class Parent1{
    
    abstract void message();
}

class firstsubclass extends Parent1{
    void message(){  
        System.out.println("This is first subclass");  
    } 
}

class secondsubclass extends Parent1{
    void message(){  
        System.out.println("This is second subclass");  
    } 
}
public class Parent {
    
    public static void main(String args[])  
    {  
        Parent1 f=new firstsubclass();
        f.message();
        Parent1 s=new secondsubclass();
        s.message();

    }
    
}