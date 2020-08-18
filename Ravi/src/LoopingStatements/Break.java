package src.LoopingStatements;

public class Break {
    public static void main(String args[])
    {
            for (int i = 5; i < 10; i++)
            {
            if (i == 8)
            break;
            System.out.println(i);
            }

            for(int i=1;i<=10;i++){  
                if(i==8){
                    break;  
                }  
                System.out.println(i);  	
            }  



//using break in do while loop
            int i=1;   
		do
        {  
			if(i==15)
            {  
			i++;  
				break; 
			}  
			System.out.println(i);  
			i++;  
		}while(i<=20);  
    }
    
}