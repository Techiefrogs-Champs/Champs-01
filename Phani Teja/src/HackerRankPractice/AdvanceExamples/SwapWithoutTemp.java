package HackerRankPractice.AdvanceExamples;

import java.util.*;
public class SwapWithoutTemp {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first String: ");
         String a=sc.nextLine();
         System.out.println("Enter Second String: ");
         String b=sc.nextLine();
         a=a+b;
         b=a.substring(0, a.length()-b.length());
         a=a.substring(b.length());
         System.out.println(a+" "+ b);
         sc.close();
    }
}
