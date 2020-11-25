class Multiplies { 
  
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
    
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 
} 
  
class method1 { 
    public static void main(String[] args) 
    { 
  
        System.out.println(Multiplies.Multiply(2, 4)); //calling the method with 2 integers
        
        System.out.println(Multiplies.Multiply(5.5, 6.3)); // calling the method with 2 doubles
    } 
} 
