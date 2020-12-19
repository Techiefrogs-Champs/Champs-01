

import java.util.Scanner;

//Using For loop

public class Sum_Naturalnums {

    public static void main(String[] args) {
   
     int num ;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a possitive number : ");
		num = sc.nextInt();
    
     int Sum = 0;
     for (int i = 1; i <= num; i++) {
      Sum += i;
     }
   
     System.out.println(" Sum of: "+num+" numbers is: " + Sum);
    }
   
   } 
   //Using while Loop
   /*
   public class Sum_Naturalnums {

    public static void main(String[] args) {
   
     int num;
     int Sum = 0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a possitive number : ");
	 num = sc.nextInt();
     int i = 1;
   
     while (i <= num) {
      Sum += i;
      i++;
     }
     System.out.println("Sum of : "+num+" numbers: " + Sum);
    }
   
   } */