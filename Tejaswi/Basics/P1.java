import java.util.*;
class P1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
int count=0;
System.out.println("enter a number");
n=sc.nextInt();
if(n%2 == 0)
{
System.out.println("notprime");
count++;
}
else
{
System.out.println("prime");
}
}
}
