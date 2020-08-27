package Basics;
import java.util.Scanner;
public class Prog_10 {
    

    public static void main(String[] args) 
    {
    Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
    int n=s.nextInt();
    int i=1;
    while(i<=5)
        {
        System.out.println(n+" * "+i+" = "+n*i);
        i++;
        }
    }
}
    
