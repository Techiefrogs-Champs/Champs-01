import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
        int  n,i, j,count=0;
		
        System.out.print("prime nos b/w 1 to 50: ");
        for(i=1;i<=50; i++)
        {
	count=0;
	for(j=2; j<i; j++)
{
            if(i%j == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print(i + " ");
        }
    }
 }
}
