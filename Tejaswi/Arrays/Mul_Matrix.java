import java.util.*;
import java.lang.Math;
class Mul_Matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,r2,c1,c2,i,j,k;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		System.out.println("Enter the order of matrix a");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the order of matrix b");
		r2=sc.nextInt();
		c2=sc.nextInt();
		if(c1==r2)
		{
			System.out.println("Enter the matrix a");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				a[i][j]=sc.nextInt();
			}
			System.out.println("Enter the matrix b");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				b[i][j]=sc.nextInt();
			}
			int c[][]=new int[10][10];
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				c[i][j]=0;
			}
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					c[i][j]=0;
					for(k=0;k<c1;k++)
					{
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.print(" \n");
			}
		}
		else
		System.out.println("matrix multiplication is not possible");		
	}
}
	
		
				
			
		