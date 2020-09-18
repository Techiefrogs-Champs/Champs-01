package Array;

public class End9 {
    
public static void main(String[] args) {
  int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
  
   int rows=a.length;
   int cols=a[0].length;
    if (rows!=cols){

      System.out.println("this is a square matrix");   
    }
  else{

   System.out.println("upper triangular matrix");
     for(int i=0;i<rows;i++){
     for(int j=0;j<cols;j++){
    if(i>j){

      System.out.print("0");

    }
   else{

    System.out.print(a[i][j]+" ");
   }

   
     }

   System.out.println();

     }





   
  }






}






}