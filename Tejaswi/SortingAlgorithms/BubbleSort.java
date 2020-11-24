package SortingAlgorithms;
import java.util.*;
public class BubbleSort 
{
public static void main(String args[])
{
int n,i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements");
n=sc.nextInt();
int a[]=new int [n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=n-1;i>=0;i--)
{
for(j=0;j<i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
sc.close();
System.out.println("after sorting elements are");
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}
}
