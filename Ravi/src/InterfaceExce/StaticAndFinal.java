package src.InterfaceExce;
interface f1{
    int x = 1;
    public static final int y = 10;
    
    static void msg(){  
        System.out.println("This is static method");  
    }  
}


public class StaticAndFinal implements f1 {
    public static void main(String args[]){
        StaticAndFinal obj=new StaticAndFinal();
           f1.msg();
           System.out.println(f1.y);
    }
    
}