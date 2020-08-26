package Basicprograms;


import java.util.Scanner;

public class GCD {

		public static void main(String[] args) {
	   
		   int a , b ;
		   Scanner obj = new Scanner(System.in);
		   System.out.print("enter one value to get GCD: ");
		   a = obj.nextInt();
		   System.out.print("enter 2nd value to get GCD: ");
		   b = obj.nextInt();
	   
		   while(a != b){
			   if(a > b)
					   a = a-b;
				   else
					   b = b-a;
		   }
	   
		   System.out.println("G.C.D = " + a);
	   }
   }