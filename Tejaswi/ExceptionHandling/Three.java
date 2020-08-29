 class Three{
    static void validate(int marks){  
        if(marks<35)  
         throw new ArithmeticException("fail");  
        else  
         System.out.println("Pass");  
      }  
      public static void main(String args[])
{  
         validate(45);  
         System.out.println("throw keyword");  
     }  
   }  