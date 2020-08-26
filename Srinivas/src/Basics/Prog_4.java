package Basics;
import java.util.*;  
public class Prog_4 {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value");  
        i = sc.nextInt();
        if(i%2==0){
            System.out.println("given number is Even");
        }
        else{
            System.out.println("given number is Odd");
        }
    }
    
}