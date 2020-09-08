public class End1 {
   
    public static void main(String[] args) {
        
     int b[]={1,0,8,1,3,8,7,0};


     for(int i=0;i<b.length-1;i++){

      for(int j=i+1;j<b.length;j++){

       if((b[i]==b[j]) &&(i!=j) ){

         System.out.print(b[j]+",");
       }

      }

     }






    } 








}