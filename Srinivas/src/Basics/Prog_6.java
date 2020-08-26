package Basics;
import java.util.*;
public class Prog_6 {
    public static void main (String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the  a value");  
        a = sc.nextInt();
        System.out.println("Enter the  b value");  
        b = sc.nextInt();
        System.out.println("Enter the  c value");  
        c = sc.nextInt();
        if(a>b)
        {
            System.out.println("Big no is"+a);
        }
        else if(b>c){
            System.out.println("Big no is"+b);
        }
        else{
            System.out.println("Big no is"+c);
        }


    }
}    
