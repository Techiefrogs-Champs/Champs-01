package Arrays;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows:");
        int noOfrows;
        do{
            System.out.println("To generate a diamond Please enter a positive number and greater than 1: ");
            while(!scanner.hasNextInt()){
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.\n",input);
            }
            noOfrows = scanner.nextInt(); 
        }
        while(noOfrows < 2);
        System.out.printf("You have entered a positive number %d.\n", noOfrows);


        int midRow = (noOfrows)/2;
        int row = 1;

        for(int i = midRow; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= row; j++){
                System.out.print(row+" ");
            }
            System.out.println();
            row++;
        }

        for(int i=0; i<=midRow; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = row; j>0; j--){
                System.out.print(row+" ");
            }
            System.out.println();
            row--;
        }
    }
}
