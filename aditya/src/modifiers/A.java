package modifiers;

 class B {
    int i=3;
    int j=5;
    int c =i+j;
    public int b2(){
        System.out.println("add the two numbers = " + c);
      return c;
    }
 }
   public class A{
       public static void main(String []args){
       B obj=new B();
       obj.b2();
       }
   } 
