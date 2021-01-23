package java2blog.Queues;
import java.util.*;

public class Pattern {  
    public static void main(String[] args){ 
    
        Scanner sc = new Scanner(System.in);
        int numOfRows;
        do{
            System.out.println("to generate diamond please enter positive number greater than 1");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\"is not a valid number.\n", input);
            }
            numOfRows = sc.nextInt();
        }
        while(numOfRows<2);
        System.out.printf("you have entered a positive number %d.\n", numOfRows);

        int midRow = (numOfRows)/2;
        int row = 1;

        for (int i = midRow; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(row +" ");
            }
            System.out.println();
            row++;
        }
        for (int i = 0; i <= midRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = row; j > 0; j--) {
                System.out.print(row+" ");
            }
            System.out.println();
            row--;
        }
    }
}
