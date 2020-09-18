package Array;

public class End16 {
   
   public static void main(String[] args) {

      int[]a={1,2,3,4};

       int []b={5,6,7,8,9,};
       
       int len1=a.length;
       int len2=b.length;
       int len3=a.length+b.length;
       int []c=new int[len3] ;
        for(int i=0;i<a.length;i++){

         c[i] =a[i];  
        }

         for(int i=0;i<b.length;i++){

          c[len1+i]=b[i];  
         }

          for(int i=0;i<c.length;i++){

          System.out.print(c[i]+" ");

          }

              System.out.println();



   }  







}