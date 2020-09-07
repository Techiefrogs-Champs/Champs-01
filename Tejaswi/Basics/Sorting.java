import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		int i,j,n,temp;
		int a[]=new int[10];
		System.out.println("Enter the array size");
		n=d.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		a[i]=d.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		System.out.println(a[i]+" ");
		System.out.println("\n");
	}
}	
			