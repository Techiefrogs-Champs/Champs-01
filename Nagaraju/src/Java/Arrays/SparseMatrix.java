/*Java Program to determine whether a given matrix is an identity matrix*/
package Arrays;
class SparseMatrix {    
    public static void main(String[] args) {    
        int rows, size,cols,count=0;            
//Initialize matrix a    
        int a[][] = {       
                        {4, 0, 0},    
                        {0, 5, 0},    
                        {0, 0, 6}    
                    };
 //Calculates the number of rows and columns present in the given matrix    
          rows = a.length;    
          cols = a[0].length;

          size = rows*cols;

          for(int i=0;i<rows;i++){
              for(int j=0;j<cols;j++){
                  if(a[i][j]==0)
                  count++;
              }
          }
          if(count>(size/2))
          System.out.println("Given matrix is sparse matrix");
          else
          System.out.println("Given matrix is not a sparse matrix");
        }
    }
