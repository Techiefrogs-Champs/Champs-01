import java.util.*;
class LCM
{
   public static void main(String args[])
{
      int  n1,n2, temp1,temp2,temp, hcf, lcm;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter First Number: ");
      n1 = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      n2 = scanner.nextInt();
      temp1=n1;
      temp2=n2;
      while(temp2 != 0)
      {
         temp = temp2;
         temp2 = temp1%temp2;
        temp1= temp;
      }
    hcf =temp1;
    lcm=(n1*n2)/hcf;          System.out.println("LCM of input numbers: "+lcm);
   }
}