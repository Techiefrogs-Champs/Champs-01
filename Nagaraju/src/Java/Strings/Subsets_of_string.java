/* 7) Java Program to find all subsets of a string */

package Strings;

import java.util.Scanner;

class Subsets_of_string {
    public static void main(String[] args) 
	{  
        String str ;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = obj.nextLine();
        int len = str.length();  
        System.out.println("Total no of subsets are: "+(len*(len+1)/2));
        int temp = 0;  
        String arr[] = new String[len*(len+1)/2];  
  
        for(int i = 0; i < len; i++) 
		{  
            for(int j = i; j < len; j++) 
			{  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) 
		{  
            System.out.println(arr[i]);  
        }  
        obj.close();
    }  
} 