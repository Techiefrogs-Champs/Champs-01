import java.util.Scanner;

public class Input_validation {
    
    static int validate() {
        Scanner sc = new Scanner(System.in); 
        int number;

    do { 
        while (!sc.hasNextInt()) {
            String input = sc.next();
            
            System.out.println("That's not a number!");  
        } 
        number = sc.nextInt(); 
    } 
    while (number <0); 
    return number;
    
}
   void division(int num1, int num2){
    
        try{
            int div=num1/num2;
            System.out.println("division of the given numbers:"+div);
            }
            catch(ArithmeticException e){
                System.out.println("not divisable by zero");
            }
    }
public static void main(String[] args) {
    int num1,num2;
    System.out.println("Enter the first number:");
    num1 = validate();
    System.out.println("Enter the second number:");
    num2 = validate();
    Input_validation obj= new Input_validation();
    obj.division(num1,num2);
}
    
}