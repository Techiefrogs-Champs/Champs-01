package polymorphism;

public class Sim {
  static int name( int a,int b){ 

   return(a+b);

  }
  
    static double name(double a, double b){ 

     return(a+b);

    }
public static void main(String[] args) {
    
 System.out.println(Sim.name(5,4));
  System.out.println( Sim.name(2.5,5.6));
}
    


}