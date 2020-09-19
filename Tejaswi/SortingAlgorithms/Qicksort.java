package SortingAlgorithms;

import java.util.Scanner;

public class Qicksort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemnts");
         int n = sc.nextInt();
         int a[] = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
       int low=0;
       int high=n-1;
        qs(low,high);
        for(int i=0;i<n;i++)
        {
           System.out.println(a[i]+" ");
        }
    }
    public static int qs( int low,int high) 
    {
        int mid;
        if (low < high) {
            mid = partition(low,high);
            qs(low, mid - 1);
            qs(mid + 1, high);
        }
        return 0;
    }
    public static int partition(int low,int high)
    {
        int temp;
        int p=high;
        int i=low;
        int j=high-1;
        while(i<=j)
        {
        while (a[p]>a[i]) 
        {
            i=i+1;
        }
        while(a[p]<a[j])
        {
            j=j-1;
        }
        if(i<=j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        else
        break;
    }
    temp=a[i];
    a[i]=a[p];
    a[p]=temp;
        return i;
    }
}
