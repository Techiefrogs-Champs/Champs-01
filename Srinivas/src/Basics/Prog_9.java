package Basics;
import java.util.*;
public class Prog_9 {
    public static void main(String[] args){
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            s=s+i;
        }
    System.out.println("sum of  Given numbers is"+s);
    }
}
    
