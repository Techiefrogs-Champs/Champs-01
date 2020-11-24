package Array;

public class End18 {
   
    public static void main(String[] args) {
       
      int a[] ={1,2,3,3,4,5,5,6,7} ;  
       int tem[]=new int[a.length];

    int j=0;
    for(int i=0;i<a.length-1;i++){
          if (a[i]!=a[i+1]){

              tem[j]=a[i];
                j++;}

    }
              tem[j]=a[a.length-1];

      for( int i=0;i<tem.length;i++){

       System.out.print(tem[j]+"  ");

      }
         System.out.println();
    }  






}