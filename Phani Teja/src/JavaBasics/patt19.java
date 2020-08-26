package JavaBasics;

public class patt19 {
    public static void main(String args[]) {
        char i,j;
        for(i='A';i<='E';i++){
            for(j='A';j<='E';j++)
            {
            if(i>=j)
            System.out.print(" " +j); 
            }   
            System.out.println("\n");        
        }
        
    }
}