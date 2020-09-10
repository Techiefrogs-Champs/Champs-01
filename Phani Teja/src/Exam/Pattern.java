package Exam;
import java.util.*;


public class Pattern {
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println("");
        }
    }
    
}
