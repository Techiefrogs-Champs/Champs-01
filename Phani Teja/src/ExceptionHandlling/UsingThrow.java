package ExceptionHandlling;


public class UsingThrow {
        static void validate(int marks){
            if(marks<35)
                throw new ArithmeticException("fail");
            
            else
                System.out.println("Congrats,You passed the exam");
        }
            
            public static void main(String[] args) {
                validate(32);
            System.out.println("run the code");
        }
    
}