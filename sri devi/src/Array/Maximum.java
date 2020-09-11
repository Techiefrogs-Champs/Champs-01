//package Array;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter elements in array:");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt(); 
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
             max=a[i];

            }
        }
       System.out.println("maximum value is:"+max);
    }
    
}
