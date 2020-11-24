package Programs;

import java.util.Scanner;

public class PairsSum {

    public static void main(String[] args) 
    {
     int i,j;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter the elements");
     for(i=0;i<n;i++)
     a[i]=sc.nextInt();
     System.out.println("enetr the target number");
     int target=sc.nextInt();
     System.out.println("pairs that sum is equal to target is:");   
      //sc.close();
     for(i=0;i<n;i++)
     {
         for(j=i+1; j < n;j++)
         {
            if(a[i]+a[j]==target)
            {
                 //System.out.println("pairs that sum is equal to target is:");
                 System.out.println(a[i]+ "," +a[j]);
            }
        }  
     }
     sc.close();
    }   
}
