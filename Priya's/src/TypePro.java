public class TypePro 
{ 
  public void m1(double a) 
  { 
     System.out.println(a*a); 
  } 
public void m1(float a) 
{ 
   System.out.println(a*a); 
 } 
public static void main(String[] args) 
{ 
   TypePro t = new TypePro(); 
     t.m1(2); 
 } 
}