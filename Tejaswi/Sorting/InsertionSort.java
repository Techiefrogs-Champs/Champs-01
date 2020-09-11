import java.util.*;
class InsertionSort
{
public static void main(String args[])
{
int n,i,j,key;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements");
n=sc.nextInt();
int a[]=new int [n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
key=a[i];
for(j=i-1;j>=0;j--)
{
if(key<a[j])
{
a[j+1]=a[j];
//j=j-1;
}
else
break;
}
a[j+1]=key;
}
System.out.println("after sorting elements are");
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}
}
