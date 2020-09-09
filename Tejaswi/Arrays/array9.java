
import  java.util.*;

class array9
{
public static void main(String args[])
{

Scanner p=new Scanner(System.in);
int x[]= new int[5];
int i,a, y=0;

System.out.println(" enter the value ");

for(i=0; i<5; i++)
{
x[i]=p.nextInt();

}

for(i=0; i<5; i++)
{
if(x[i]%2==0&&x[i]!=0)
{
System.out.println("the  numbers is even  "+x[i]);
y=y+x[i];
System.out.println("the sum  of even numbers is  "+y);
}


if(x[i]%2!=0)
{
System.out.println("the  numbers is odd  "+x[i]);

y=y+x[i];
System.out.println("the sum  of odd numbers is  "+y);
}
y=y+x[i];

 if(x[i]==0)
{
System.out.println("the  numbers is netural  "+x[i]);
}
}
System.out.println("the sum  of total numbers is  "+y);
}
}