


import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = rr.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}