package JavaBasics;

import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        int sum=0,r,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
    
        int temp=n;
        while(n!=0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is Palindrome");
        }
        else{
            System.out.println(temp+" is not a Palindrome");
        }

    }
}