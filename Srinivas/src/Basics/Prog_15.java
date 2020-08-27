package Basics;
import java.util.*;
public class Prog_15 {
    public static void main(String[] args){
        int n,n1,sum=0;
        int r;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the n value");  
        n = sc.nextInt();
        n1=n;
        while(n!=0){
            
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(sum==n1){
            System.out.println("Given number is palindrome:"+sum);
        }
        else{
            System.out.println("Given number is  not palindrome:"+sum);
        }
    }
    
}