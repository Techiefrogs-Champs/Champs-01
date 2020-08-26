package javaArrays;


    import java.util.*;
import java.lang.Math;
class Matrix4
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j,r,c;
		System.out.println("Enter the rows and columns");
		r=m.nextInt();
		c=m.nextInt();
		System.out.println("enter the matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=m.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("The martrix A is:");
		{
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		System.out.println("The transpose of matrix A is:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}

	}
} 
    
