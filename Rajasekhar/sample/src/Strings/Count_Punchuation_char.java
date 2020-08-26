/* 3) Java Program to count the total number of punctuation characters exists in a String */

package Strings;
import java.util.Scanner;

public class Count_Punchuation_char {
			public static void main(String[] args) { 
				String str ;
				Scanner obj =new Scanner(System.in);
				System.out.print("Enter a string: ");
				str = obj.nextLine();
				String strNew1 = str.replaceAll("[a-zA-Z0-9]",""); 
				String strNew = strNew1.replaceAll(" ",""); 
				
       			int count = 0;
       			System.out.println("punchuated characters String is: "+strNew);
       			for (int i = 0; i <strNew.length(); i++) {
          		 count++;
      			 }
       			System.out.println("Letters: "+count);
       			obj.close();
			} 
			  
		} 
		

   