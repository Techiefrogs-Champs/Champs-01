package Arrays;

public class Submat 
{  
    public static void main(String[] args) {  
        int rows, cols;  
  
         
          int a[][] = {  
                          {1, 1, 1},  
                          {1, 1, 1},  
                          {1, 1, 1}  
                       };  
  
        
          int b[][] = {  
                          {1, 0, 0},  
                         {0, 1, 0},  
                         {0, 0, 1}  
                     };  
  
           
          rows = a.length;  
        cols = a[0].length;  
  
          
        int diff[][] = new int[rows][cols];  
  
        
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("Subtraction of two matrices: ");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}    