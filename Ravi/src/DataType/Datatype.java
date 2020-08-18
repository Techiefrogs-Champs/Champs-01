package src.DataType;

public class Datatype {

    static int aa = 1;     //static variable  
    int data = 99;        //instance variable  
    void method() {
        int bb = 90;       //local variable  
    }
    public static void main(String[] args) {
        int myNum1 = 100000;
        System.out.println(myNum1);  
        short myNum2 = 5000;
        System.out.println(myNum2); 

        byte num1;
    	num1 = 113;
        System.out.println(num1);
        String ch = "ABCD";
        System.out.println(ch);
        short num2;
    	num2 = 150;
        System.out.println(num2);
        long num3 = -12332252626L;
        System.out.println(num3);
        double num4 = -42937737.9d;
        System.out.println(num4);
        float num5 = 19.98f;
        System.out.println(num5);

        boolean b1 = false;
        System.out.println(b1);
       
        boolean b2 = true; 
        if (b2 == true) 
            System.out.println("Hi Geek"); 
        boolean Java = true;
        boolean Python = false;
        System.out.println(Java);   // Output will be true
        System.out.println(Python); // Output will be false

        byte a1 = 126; 
        System.out.println(a1); 
  
        a1++; 
        System.out.println(a1); 
     
        a1++; 
        System.out.println(a1); 
         
        a1++; 
        System.out.println(a1); 

        byte n, a;
        n = 127;
        a = 127;
        System.out.println(n); // prints 127
        System.out.println(a);
    
}
}
