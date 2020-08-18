package src.Inheritance;

class a{
    public int a=100;

    void m1(){
        System.out.println("This is M1 Method");
    }

    a(){
        System.out.println("Constructor of Parent");
    }
}

class b extends a{
    public int a=200;
    void m2(){
        System.out.println("This is M2 Method");
        System.out.println(a);
        System.out.println(super.a);
     }

     b(){
       
        System.out.println("Constructor of child");
    }
}


public class single {
    public static void main(String[] main){
        b obj=new b();
        obj.m2();  

        // new b();   Constructors and Inheritance     

     }
    
}
