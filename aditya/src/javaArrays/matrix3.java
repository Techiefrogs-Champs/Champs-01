package javaArrays;


    import java.util.*;
class Matrix3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c,i,j;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		System.out.println("Enter the order of matrix a");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the order of matrix b");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the matrix a");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("Enter the matrix b");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("Substraction of matrix is:");
		for(i=0;i<r;i++)
		{

			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]-b[i][j]+"\t");
			}
		System.out.println(" ");
		}
	}
}	

    
