package JavaBasics;

public class patt18 {
    public static void main(String args[]) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++)
            {
            if(i>=j)
            System.out.print(" "+i); 
            }   
            System.out.println("\n");        
        }
        
    }
}