public class TypePro 
{ 
 
public void m1(float a) 
{ 
   System.out.println(a*a); 
   System.out.println("float arg is invoked");
 } 

 public void m1(double a) 
 { 
    System.out.println(a*a); 
    System.out.println("double arg is invoked");
 } 
public static void main(String[] args) 
{ 
   TypePro t = new TypePro(); 
     t.m1(2.0); // double arg is invoked 
 } 
}