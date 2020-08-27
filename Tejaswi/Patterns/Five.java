import java.util.Scanner;

public class Five
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        for (int i=1; i<=(rows * 2 -1); i++)
        {
            for (int j=1; j<=rows; j++)
            {
                if(j==i || j==rows-i+1)
                {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}