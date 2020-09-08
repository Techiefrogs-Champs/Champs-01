import java.util.*;
class Linear
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,key;
		System.out.println("Enter the size of array");
		n=m.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		a[i]=m.nextInt();
		System.out.println("Enter key value");
		key=m.nextInt();
		for(i=0;i<n;i++)
		{
			if(key==a[i])
			{
				System.out.println(key+"is found at"+(i)+"position");
				break;
			}
		}
			if(i>=n)
			{
				System.out.println(" Element is not found at location");
			}
	}
}
		