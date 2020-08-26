package src.String;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {    
        
        //27
        int rows, cols;    
        boolean flag = true;    
        int a[][] = {       
                        {1, 0, 0},    
                        {0, 1, 0},    
                        {0, 0, 1}    
                    };    
            
      
        rows = a.length;    
        cols = a[0].length;    
            
     
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
          
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(i == j && a[i][j] != 1){    
                      flag = false;    
                      break;    
                  }    
                  if(i != j && a[i][j] != 0){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag)    
                System.out.println("Given matrix is an identity matrix");    
            else    
                System.out.println("Given matrix is not an identity matrix");    
        } 

        //28
        int rows1, cols1, size, count = 0;       
        int a1[][] = {       
                        {4, 0, 0},    
                        {0, 5, 0},    
                        {0, 0, 6}    
                    };    
              
        
                    rows1 = a1.length;    
                    cols1 = a[0].length;    
        size = rows1 * cols1;            
    
        for(int i = 0; i < rows1; i++){    
            for(int j = 0; j < cols1; j++){    
                if(a[i][j] == 0)    
                    count++;    
                }    
            }    
                
        if(count > (size/2))    
            System.out.println("Given matrix is a sparse matrix");    
        else    
            System.out.println("Given matrix is not a sparse matrix"); 

        //29
        int row1, col1, row2, col2;    
        boolean flag1 = true;    
            
    
        int a2[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
                    };    
              
     
        int b[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
            };    
        
          row1 = a1.length;    
        col1 = a1[0].length;    

          row2 = b.length;    
        col2 = b[0].length;    
            
     
        if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }    
        else {    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a1[i][j] != b[i][j]){    
                    flag1 = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag1)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }  
        
        
        //30-31
        int rows2, cols2;    
            int a3[][] = {       
                            {1, 2, 3},    
                            {8, 6, 4},    
                            {4, 5, 6}    
                        };    
                  
            rows2 = a3.length;    
            cols2 = a3[0].length;    
                
              if(rows2 != cols2){    
                  System.out.println("Matrix should be a square matrix");    
              }    
              else {    
                   
                  System.out.println("Lower triangular matrix: ");    
                  for(int i = 0; i < rows2; i++){    
                      for(int j = 0; j < cols2; j++){    
                        if(j > i)    
                          System.out.print("0 ");    
                        else    
                          System.out.print(a3[i][j] + " ");    
                    }    
                    System.out.println();    
                }    
            }   
            
            //32
            int rows3, cols3, countOdd = 0, countEven = 0;  
            int a4[][] = {     
                            {4, 1, 3},  
                            {3, 5, 7},  
                            {8, 2, 6}  
                        };  
                
             
                        rows3 = a4.length;  
                        cols3 = a4[0].length;  
    
            for(int i = 0; i < rows3; i++){  
                for(int j = 0; j < cols3; j++){  
                  if(a4[i][j] % 2 == 0)  
                    countEven++;  
                  else  
                    countOdd++;  
                }  
            }            
            System.out.println("Frequency of odd numbers: " + countOdd);  
            System.out.println("Frequency of even numbers: " + countEven);

            //33

            int a5[][]={{1,1,1},{2,2,2},{3,3,3}};    
            int b5[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
            
            int c[][]=new int[3][3];    
                
            
            for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            c[i][j]=0;      
            for(int k=0;k<3;k++)      
            {      
            c[i][j]+=a5[i][k]*b5[k][j];      
            }  
            System.out.print(c[i][j]+" ");  
            }
            System.out.println();  
            }    


    }


    
}