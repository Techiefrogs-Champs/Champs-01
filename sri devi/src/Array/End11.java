public class End11 {
    public static void main(String[] args) {
        
     boolean f=true;
     int a[][]={{1,2,3},{4,5,6},{7,8,9}};
      int b[][]={{1,2,3},{4,5,6},{7,8,9}};
      int r1=a.length;
      int c1=a[0].length;

      int r2=b.length;
      int c2=b[0].length;
     if(r1!=r2||c1!=c2){

      System.out.println("matrices are not equal");
     }
     else{

      for(int i=0;i<r1;i++){

      for( int j=0;j<r2;j++){

     if(a[i][j]!=b[i][j]){
       f=false;
       break;

     }
      }


      }


     }


    if(f){

      System.out.println("matrices are equal");     
    }
    else{

        System.out.println("matrices are not equal");   
    }
    } 








}