import java.io.*;
class Factorial
{
public static void main(String args[])
{
int i=1,fact=1;
int n=5;
System.out.println("Enter the n");
DataInputStream dis=new DataInputStream(System.in);
while(i<=n)
{
fact=fact*i;
i++;
}
System.out.println("factorial of"+n+"is:"+fact);
}
}