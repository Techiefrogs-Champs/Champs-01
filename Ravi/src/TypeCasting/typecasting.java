package TypeCasting;

public class typecasting {
    public static void main(String[] args)
{
        int i = 200;
        long l = i;
        float f = l;
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

        //...............

        int myInt = 9;
        double myDouble = myInt; 
    
        System.out.println(myInt);      
        System.out.println(myDouble);

           //...............

        double myDoubl = 9.78;
        int myIn = (int) myDoubl; 

        System.out.println(myDoubl);   
        System.out.println(myIn); 


         //...............

        byte b;  
        int i1 = 257;  
        double d = 323.142; 
        System.out.println("Conversion of int to byte.");  
    
        b = (byte) i1;  
        System.out.println("i = " + i1 + " b = " + b); 
        System.out.println("\nConversion of double to byte."); 
          
     
        b = (byte) d;  
        System.out.println("d = " + d + " b= " + b); 

        //...............

        byte b1 = 42;  
        char c = 'a';  
        short s = 1024; 
        int i2 = 50000; 
        float f1 = 5.67f; 
        double d1 = .1234; 
  
        double result = (f1 * b1) + (i2 / c) - (d1 * s); 
        System.out.println("result = " + result);


        int num = 10;
        System.out.println("The integer value is: " + num);
    
        String data = String.valueOf(num);
        System.out.println("The string value is: " + data);
}
    
}