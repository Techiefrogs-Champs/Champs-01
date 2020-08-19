package Fresh;

public class Pyramid {
   public static void main(String[] args) {
       for(int i=1;i<=8;i++){   

      for (int j=8;j>=i;j--){
        System.out.print(" ");

      }
      for (int k=1;k<=i;k++){

         System.out.print("*");
      }
       for(int l=2;l<=i;l++){
        System.out.print("*");

       }
      System.out.println();
       }

  for(int i=1;i<=8;i++){

   for(int j=1;j<=i;j++){

   System.out.print(" ");

   }
   for(int k=8;k>=i;k--){
      System.out.print("*");
   }
    for(int l=7;l>=i;l--){

     System.out.print("*");  
    }
 System.out.println();
  }




       
   }  





}