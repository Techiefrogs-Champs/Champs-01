//import javax.lang.model.util.ElementScanner14;
package Exam;
import java.util.Scanner;

public class Arm {
    static int validate()
    {
        Scanner s= new Scanner(System.in);
        int n;
        do{
            while(!s.hasNextInt())
            {
                String input= s.next();
                System.out.println("Not a number");
            }
            n=s.nextInt();
        }
        while(n<=0);
        return n;
    }
    public static void main(String[] args)
    {
    int n;
    int rem,sum=0,check;
    System.out.println("Num=");
    n=validate();
    check=n;
    while(check!=0){
        rem=check%10;
        check=check/10;
        sum=sum+(rem*rem*rem);
        
    }
    if(sum==n)
        System.out.println("It is a armstrong num");
        else
        System.out.println("Not a armstrong");
    
}
}
