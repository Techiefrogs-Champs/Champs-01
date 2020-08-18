package src.Interface;



interface Inf1{

    //int x;
    int x=10;
    


    public void method1();
    public void method3();
    //public void aaa();
 }

 interface Inf2 extends Inf1 { 
    final  int x=100;
    public void method2();
    // public int aaa();    two interfaces that have methods with same name but different return type.
 }

 public class interfce implements Inf2{

     public void method1(){
       
        System.out.println("method1");
     }
     public void method2(){
        System.out.println("method2");
     }
     public void method3(){
        System.out.println("method3");
     }

     public static void main(String args[]){
        Inf2 obj = new interfce();
        obj.method3();
        System.out.println(x); 
        System.out.println(Inf1.x);
        System.out.println(Inf2.x);
     }
 }