package src.Polymorphism;


class MultiplyFun { 

    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
    static int Multiply(int a, int b,int c) 
    { 
        return a * b *c; 
    }
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 


    void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String - "+ s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a + b; 
        System.out.println("Sum = " + c); 
    } 
    
}

public class Methodoverloading {
    public static void main(String[] args) 
    { 
        MultiplyFun obj= new MultiplyFun();
        
        System.out.println(MultiplyFun.Multiply(2, 4)); 
        System.out.println(MultiplyFun.Multiply(2, 7, 3));
        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 

        obj.operator("Ravi", "Teja");
        obj.operator(3,3);
       
    }

    
}