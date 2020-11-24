package Array;

public class End13 {
    
   public static void main(String[] args) {
       
     int a[][]={{1,4,5},{2,5,7},{3,6,8}};
     int b[][]={{2,3,4},{5,6,7},{8,9,0}};

    int c[][]=new int[3][3];

      for(int i=0;i<3;i++){

      for(int j=0;j<3;j++){

        c[i][j]=a[i][j]-b[i][j];
        System.out.print(c[i][j]+" ");
      }
        System.out.println();
      }




   }












}