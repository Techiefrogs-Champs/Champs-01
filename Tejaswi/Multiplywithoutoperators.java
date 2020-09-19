import java.util.Scanner;

public class Multiplywithoutoperators {
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
       int n1= s.nextInt();
        int n2=s.nextInt();
        for(int i=1; i<=n2;i++)
        {
            sum += n1;
        }
        System.out.println("multiplication of two numbers is:");
        System.out.println(sum);
    s.close();
    }
}