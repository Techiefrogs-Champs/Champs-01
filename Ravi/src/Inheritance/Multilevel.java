package src.Inheritance;

class x{

    int a=100;
    void m1(){
        System.out.println("This is M1 Method");
    }
}

class y extends x{

    int a=200;
    String name="Ravi";
     void m2(){
        System.out.println("This is M2 Method");
     }
}
class z extends y{

    int a=300;
    String name="Teja";
     void m3(){
         super.m2();
       //System.out.println("This is M3 Method");
       System.out.println(super.a);
     }

     void disp(){
        System.out.println(super.name);
     }
}
public class Multilevel {
    public static void main(String[] main){
        z obj=new z();
        obj.m3();
        obj.m2();
        System.out.println(obj.a);
        obj.disp();
        
              
     }
    
}

