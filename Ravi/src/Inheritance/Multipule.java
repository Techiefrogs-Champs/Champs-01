package src.Inheritance;


 
interface IF1 {
    public int i=100;
    public void m1();

    default void green(){
        System.out.println("green");
    }
 }
 interface IF2 {
    public int j=200;
    public void m2();
    
    default void blue(){
        System.out.println("blue");
    }
 }

 public class Multipule  implements  IF2, IF1{
    
     public void m1(){
         System.out.println(i);
         System.out.println("This is Interface M1 method");
     }
     public void m2(){
        System.out.println(j);  
         System.out.println("This is Interface M2 method");
    }
    public static void main(String[] args){
        Multipule obj=new Multipule();
        obj.m1();
        obj.m2();
        obj.blue();
        obj.green();
       
    }
 }