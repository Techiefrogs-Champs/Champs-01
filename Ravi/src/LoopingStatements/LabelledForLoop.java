package src.LoopingStatements;

public class LabelledForLoop {
    public static void main(String[] args) 
        { 
            num:  
                for(int i=1;i<=5;i++)
        {  
            num1:  
                for(int j=1;j<=5;j++)
        {  
                if(i==2&&j==2)
        {  
                break num;  
        }  
                System.out.println(i+" "+j);  
        }  
    }  
} 
}