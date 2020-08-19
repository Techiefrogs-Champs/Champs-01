package polymorphism;

public class Hi {
    
 public int mem( int a,int b){ 

   return (a+b);

 }   


public double mem( double a,double b){ 
 return(a+b);

}

  public static void main(String[] args) {
      Hi obj=new Hi();
     System.out.println("sum is"+" "+obj.mem(5,4));
     System.out.println(" sum is"+" "+obj.mem(2.5,4.5));
  }

}