package patterns;

public class pattern9 {
    public static void main(String[] args) {
        for (int i1 = 1; i1 <= 10; i1++)  
        {  
        for (int j1 = 1; j1 <= 10; j1++)  
        {  
            if (i1==1 || i1==10 || j1==1 || j1==10 )  
                System.out.print(" 1");  
            else  
                System.out.print("  ");  
        }  
        System.out.println();  
    }  
    }
    
}