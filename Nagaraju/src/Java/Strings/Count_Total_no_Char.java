/* 1) Java Program to count the total number of characters in a string */


import java.util.Scanner;

class Count_Total_no_Char {
    public static void main(String []args) {
        Scanner obj =new Scanner(System.in);

       String str ;
       System.out.print("Enter a string: ");
       str = obj.nextLine();
       int count = 0;
       System.out.println(" Entered String is: "+str);
       for (int i = 0; i <str.length(); i++) {
          
          count++;
       }
       System.out.println("Letters: "+count);
       obj.close();
    }
    
 }