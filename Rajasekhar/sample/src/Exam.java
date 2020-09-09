package src;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        int number;
        
        Scanner obj = new Scanner(System.in);
        do{
            System.out.print("Please enter a positive number:");
            while(!obj.hasNextInt()){
                String Str1 = obj.next();
                System.out.println(Str1+": is not a number ");
            }
           number = obj.nextInt();
        }while(number<0);

        System.out.println(number+": is a positive number");
        int temp,sum=0 ;
        int tempo = number;
        while(number!=0){
            temp = number%10;
            sum = (sum*10)+temp;
            number = number/10;
        }
        if(tempo==sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
        obj.close();

    }
    
}