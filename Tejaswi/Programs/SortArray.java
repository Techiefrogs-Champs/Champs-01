package Programs;

import java.util.Scanner;

public class SortArray 
{
    public static void main(String[] args) 
    {
        int i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
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
//        sc.close();
        System.out.println("after sorting elements are");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
