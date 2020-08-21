import java.util.*;
class Armstrong
{
  public static void main(String[] args) 
{
  int n, r,temp,sum = 0;
  System.out.println("Enter 3 Digit Number");
  Scanner scanner = new Scanner(System.in);
  n= scanner.nextInt();
  temp=n;
  while(n>0)
  {
            r = n% 10;
              n=n/10;
            sum = sum+(r*r*r);
        }
       if(sum == temp)
            System.out.println(" is an Armstrong number");
        else
            System.out.println( "is not an Armstrong number");
    }
}