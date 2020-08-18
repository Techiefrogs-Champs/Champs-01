package src.LoopingStatements;

public class Countine {
    public static void main(String args[])
    {
        for (int k = 5; k < 15; k++)
        {
        // Odd numbers are skipped
        if (k%2 != 0)
        continue;
        // Even numbers are printed
        System.out.print(k + " ");
        }


        for(int i=1;i<=10;i++)
		{
			if(i==5)
        {
			continue;
			}  
			System.out.println(i);  
        }  
        
    }
}