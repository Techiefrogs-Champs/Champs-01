import java.util.Scanner;

public class Factorial_1{
    //public int num;
    static int validate(){
        Scanner obj=new Scanner(System.in);
        int num;
        do{
            System.out.print("please Enter a positve number:");
            while(!obj.hasNextInt()){
                String s1=obj.next();
                System.out.println(s1+" :is not a valid number");
            }
            num = obj.nextInt();
        }while(num<0);
        System.out.println("you entered a valid number is: "+num);
        obj.close();
        return num;
    
    }

    
    public static void main(String[] args) {
        int num;
        
        num = validate();
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial = factorial * i;
        }
        System.out.println("factorial of "+num+" is: "+factorial);
    }
}