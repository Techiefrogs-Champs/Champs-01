import java.util.*;
class LCM
{
   public static void main(String args[])
{
      //int  n1,n2, temp1,temp2,temp, hcf, lcm;
     // static int validate()
     // {
         int  n1,n2, temp1,temp2,temp, hcf, lcm,num;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter First Number: ");
      n1 = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      n2 = scanner.nextInt();
      temp1=n1;
      temp2=n2;
      do {
         System.out.println("Please enter a positive number!");
         while (!scanner.hasNextInt()) 
        { 
        System.out.println("That's not a number!"); 
        scanner.next(); 
        // this is important! 
        }
         num = scanner.nextInt();
         }
        while (num <= 0); 
        System.out.println("Thank you! Got " + num);
      
      while(temp2 != 0)
      {
         temp = temp2;
         temp2 = temp1%temp2;
        temp1= temp;
      }
    hcf =temp1;
    lcm=(n1*n2)/hcf;        
      System.out.println("LCM of input numbers: "+lcm);
   }
}
//}