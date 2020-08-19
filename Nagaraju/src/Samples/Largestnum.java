

import java.util.Scanner;
public class Largestnum {

    public static void main(String[] args) {

        double n1,n2,n3 ;
        Scanner N = new Scanner(System.in);
        System.out.println("Enter a number n1: ");
         n1=N.nextDouble();
        System.out.println("Enter a number n2: ");
         n2=N.nextDouble();
        System.out.println("Enter a number n3: ");
         n3=N.nextDouble();

        if( n1 >= n2 && n1 >= n3)
            System.out.println("n1: "+n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println("n2: "+n2 + " is the largest number.");  
        else
            System.out.println("n3:"+n3 + " is the largest number.");   
    }
}