package interfaces;

 interface A {
    
       void method1();
       int a=4;
     }

class B implements A{
    public void method1(){
         int a=5;
         System.out.println("it is method1="+a);
    }
}
class inter4{
    public static void main(String []args){
        A obj=new B();
        obj.method1();
    }
}