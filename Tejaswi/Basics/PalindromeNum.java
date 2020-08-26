import java.util.*;
class PalindromeNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,r,sum=0,temp;
System.out.println("enter the number");
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}