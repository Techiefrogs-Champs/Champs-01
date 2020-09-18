package collection;

import java.util.Scanner;

public class collec2 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of elements");
        int a=sc.nextInt();
        int b[]=new int[a];
        System.out.println("enter the elements");
        for(i=0;i<a;i++){
        b[i]=sc.nextInt(); 
    }
        System.out.println("enter the target number");
        int target=sc.nextInt();
         for(i=0;i<a;i++)  {
             for(j=i+1;j<a;j++){
                if(b[i]+b[j]==target){
                    System.out.println(i+", "+j);
                } 
             }
         }

        
    }
}
