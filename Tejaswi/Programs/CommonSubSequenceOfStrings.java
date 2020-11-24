package Programs;

import java.util.Scanner;

public class CommonSubSequenceOfStrings 
{
 static int count_of_common_sub_sequence(String s1, String s2) 
 { 
   int n1 = s1.length(); 
   int n2 = s2.length(); 
   int arr[][] = new int [n1+1][n2+1]; 
   char ch1,ch2 ; 
   for (int i = 0; i <= n1; i++) 
   { 
       for (int j = 0; j <= n2; j++) 
       { 
           arr[i][j] = 0; 
        } 
    } 
    for (int i = 1; i <= n1; i++) 
    {  
        for (int j = 1; j <= n2; j++)
         { 
             ch1 = s1.charAt(i – 1); 
             ch2 = s2.charAt(j – 1); 
             if (ch1 == ch2) 
             arr[i][j] = 1 + arr[i][j–1] + arr[i – 1][j]; 
             else
             arr[i][j] = arr[i][j – 1] + arr[i – 1][j] – arr[i – 1][j – 1]; 
        } 
   } 
return arr[n1][n2]; 
}
public static void main (String args[])
{ 
     String s1;
     String s2;
    Scanner sc = new Scanner(System.in);
    System.out.print(“nEnter string 1 : “);
    s1 = sc.next();
    System.out.print(“nEnter string 2 : “);
    s2 = sc.next();
    System.out.println(“nCount of common sub sequence of two strings:”);
    System.out.println(count_of_common_sub_sequence(s1, s2)); 
} 
}
}
