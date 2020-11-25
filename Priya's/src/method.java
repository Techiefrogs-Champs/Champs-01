class Multiplying { 
  
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
    static int Multiply(int a, int b, int c) 
    { 
        return a * b * c; 
    } 
   
} 
  
class method { 
    public static void main(String[] args) 
    { 
   System.out.println(Multiplying.Multiply(2, 4)); //calling the method with 2 parameters
   System.out.println(Multiplying.Multiply(2, 7, 3)); // calling the method with 3 parameters
       
    } 
} 