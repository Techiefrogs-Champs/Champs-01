public class End25 {
   public static void main(String[] args) {
       int a[]={3,4,2,8,1};

       int max=a[0];
       for(int i=1;i<a.length;i++){
          if(max<a[i]){

            max=a[i];
          }

       }
       System.out.println("largest number is"+max);

   }  




}