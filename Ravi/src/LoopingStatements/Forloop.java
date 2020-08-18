package src.LoopingStatements;

public class Forloop {
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++)
        System.out.println(i);


        int n, i;
		n=2;
		for(i=1;i<=10;i++)
		{  
			System.out.println(n+"*"+i+"="+n*i);  
        }  
        
        for(int a=1;a<=5;a++)
        {  
        for(int j=1;j<=a;j++)
        {  
                        System.out.print("* ");  
        }  
        System.out.println(); 
        }  
    }
}