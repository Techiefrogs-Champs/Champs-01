class Calculation {
    int z;
     
    public void addition() {
       z = 10 + 50;
       System.out.println("The sum of the given numbers:"+z);
    }
     
    public void subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
    }
 }
 
 public class My_Calculation extends Calculation {
   
    public void multiplication(int x, int y, int u) {
      
        z = x * y *u;
       
       System.out.println("The product of the given numbers:"+z);
    }
     
    public static void main(String args[]) {
       int a = 20, b = 10, c = 30;
       My_Calculation demo = new My_Calculation();
       demo.addition();
       demo.subtraction(a, b);
       demo.multiplication(a, b, c);
    }
 }

