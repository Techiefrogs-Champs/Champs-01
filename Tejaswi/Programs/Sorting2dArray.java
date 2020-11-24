package Programs;

import java.util.Scanner;

public class Sorting2dArray 
{
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of  rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int c = sc.nextInt();
        int A[][]=new int[r][c];
        System.out.print("Enter the elements: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
         System.out.println("The original matrix:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
 
        /* Sorting the 2D Array */
        int temp=0;
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        if(A[i][j]>A[x][y])
                        {
                            temp = A[x][y];
                            A[x][y] = A[i][j];
                            A[i][j] = temp;
                        }
                    }
                }
            }
        }
 
        System.out.println("The Sorted Array:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}   
