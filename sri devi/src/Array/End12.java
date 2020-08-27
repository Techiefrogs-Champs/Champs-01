public class End12 {
 public static void main(String[] args) {
    int count=0;
    
    int a[][]={{1,0,0},{0,2,0},{0,0,4}};
     int r=a.length;
     int c=a[0].length;
      int size=r*c;
      for(int i=0;i<r;i++){
      for( int j=0;j<c;j++){

     if(a[i][j]==0)

        count++;

      }


      }
      if(count>(size/2)){

      System.out.println("this is a sparse matrix");


      }

    else{
          System.out.println("this is not");

    }

 }   
    






}