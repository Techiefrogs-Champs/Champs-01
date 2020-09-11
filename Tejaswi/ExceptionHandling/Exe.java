import java.util.*;
import java.io.*;
class Solution
{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=byte.MIN_VALUE && x<=byte.MAX_VALUE);
                System.out.println("* byte");
                //Complete the code
                else if(x>=int.MIN_VALUE && x<=int.MAX_VALUE);
                System.out.println("* short\n *int\n *long");
                 if else(x>=long.MIN_VALUE && x<=long.MAX_VALUE);
                System.out.println("* int\n*long);
                else
                {
                    System.out.println("* long");
                }
              }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
