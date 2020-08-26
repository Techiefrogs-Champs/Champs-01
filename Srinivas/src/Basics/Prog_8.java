package Basics;
import java.util.*;
public class Prog_8 {
    public static void main(String[] args){
        int i,n,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            f=f*i;
        }
System.out.println("Factorial of Given number is"+f);
    }
    
}