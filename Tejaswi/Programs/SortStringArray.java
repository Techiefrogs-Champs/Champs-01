package Programs;

import java.util.Scanner;

public class SortStringArray 
{
    public static void main(String[] args) 
    {
        int n;
        int i,j;
        String temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        String a[]=new String [n];
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        a[i]=sc1.nextLine();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {   
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        sc.close();
        System.out.println("after sorting elements are");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
      //  sc.close();
        sc1.close();
    }
}
