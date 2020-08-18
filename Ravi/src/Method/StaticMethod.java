package src.Method;

public class StaticMethod {

  

     static void Method1(int x,int y){
        System.out.println("It's example of static method.");  
        System.out.println("multiplication=" + x*y);
    }

    static int length(String a, String b) {
       
        return a.length() + b.length();
    }

    static String getReturn(){

        return "Kuchipudi";

    }

    public  void Method2(){
        System.out.println("Without Static");  
      
    }

    // public final String name="Ravi"; 
    // public  int age=27;
    // public  void Method3(){
    //     // name="Raviteja";
    //    // age=30;
    //     System.out.println(name);
    //     System.out.println(age);
      
    // }

    // static void test(int value) {
    //     if (value == 0) {
           
    //         return;
    //     }
    //     System.out.println(value);
        
    // }

    public static void main(String args[]) {
        // Method1(2,4);

        StaticMethod.Method1(2,4);      
        int total = length("Ravi", "Teja");
        System.out.println("Total Length is:=" + total);

        String name = getReturn();
        System.out.println("This method must be return:="+ name);
       
        StaticMethod obj=new StaticMethod();
        obj.Method2();
         
        

        // new StaticMethod().Method2();

        //test(0); 
       // new StaticMethod().Method3();

    }
}