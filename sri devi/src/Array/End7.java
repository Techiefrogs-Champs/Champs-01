package Array;

public class End7 {
    
  public static void main(String[] args) {
    int rows;int cols;int sumRow;int sumCols;  
     int a[][]= {{1,2,3},
                 {4,5,6},
                  {7,8,9},};  
    
   rows=a.length;
   cols=a[0].length;
  for(int i=0;i<rows;i++){
      sumRow=0;
   for(int j=0;j<cols;j++){
    sumRow=sumRow+a[i][j];
   System.out.print("sum of"+(i+1)+"rows"+sumRow);
   }
   System.out.println();   
  }
   for(int i=0;i<cols;i++){

     sumCols=0;
    for(int j=0;j<rows;j++){

      sumCols=sumCols+a[j][i];
      
      System.out.print("sum of"+(i+1)+"cols"+sumCols);
    }

   System.out.println();
   }




  } 
    




}