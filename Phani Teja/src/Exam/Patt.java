package Exam;
import java.util.Scanner; 

public class Patt {
    static int validate()
    {
        Scanner s=new Scanner(System.in);
        int n;
        do{
            while(!s.hasNextInt())
            {
                String input=s.next();
                System.out.println("Not a Num");
            }
            n=s.nextInt();

        }
        while(n<=0);
        return n;
    }
    public static void main(String[] args) {
        int i,j,n;
       
        System.out.println("Rows=");
        n=validate();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
