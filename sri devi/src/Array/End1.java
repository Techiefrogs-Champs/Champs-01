public class End1 {
   
    public static void main(String[] args) {
        
     int a[]={1,0,8,1,3,8,7,0};


     for(int i=0;i<a.length-1;i++){

      for(int j=i+1;j<a.length;j++){

       if((a[i]==a[j]) &&(i!=j) ){

         System.out.print(a[j]+",");
       }

      }

     }






    } 








}