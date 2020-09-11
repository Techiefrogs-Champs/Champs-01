package Exam;

import java.util.Scanner;

public class SumOfNat {
    static int validate(){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the pos num:");
            while(!sc.hasNextInt()){
                String input=sc.next();
                System.out.println("This is not a number");

            }
            n=sc.nextInt();
        }
        while(n<=0);
        return n;
    }
    public static void main(String[] args) {
       // System.out.println("Enter a natural number:");
        int n;
        n=validate();
        int Sum=0;
        for(int i=1;i<=n;i++){
            Sum=Sum+i;
        }
        System.out.println("Sum="+Sum);
    }
}
