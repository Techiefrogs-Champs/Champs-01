package Array;

public class End10 {
  public static void main(String[] args) {
    int a[][]={{1,2,3},{7,8,9},{6,5,4}};    

    int rows=a.length;
    int cols=a[0].length;
    if(rows!=cols){

   System.out.println("this is square matrix");

    }
   else{

    System.out.println("this is lower triangular matrix");
    for(int i=0;i<rows;i++){

     for(int j=0;j<cols;j++){
    if(j>i){
      System.out.print("0");
    }
      else{

       System.out.print(a[i][j]+"  ");

      }


     }
       System.out.println();
    }

   }



  } 
    





}