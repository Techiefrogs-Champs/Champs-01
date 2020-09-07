import java.util.*;
class Binary
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,key,l,h,flag=0,mid;
		System.out.println("Enter the size of array");
		n=m.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		a[i]=m.nextInt();
		System.out.println("Enter key value");
		key=m.nextInt();
		l=0;
		h=n-1;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(key==a[mid])
			{
				System.out.println(key+"is found at"+(mid)+"position");
				flag=1;
				break;
			}
			else if(key>a[mid])
			{
				l=mid+1;
			}
			else
			{
				h=mid-1;
			}
		}
		if(flag==0)
		{
			System.out.println("Element is not found at location");
		}
	}
}
			