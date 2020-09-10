package encap.polym;

class MultiplyFun { 
  
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
    static int Multiply(int a, int b, int c) 
    { 
        return a * b * c; 
    } 
    
} 
  
class methodover { 
    public static void main(String[] args) 
    { 
  
        System.out.println(MultiplyFun.Multiply(2, 4)); 
        System.out.println(MultiplyFun.Multiply(2, 7, 3));
    
    } 
} 