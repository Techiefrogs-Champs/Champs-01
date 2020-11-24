package Array;

public class End23 {
  public static void main(String[] args) {
     int a[] ={5,7,3,2,9,4};  
      int temp=0;

      for(int i=0;i<a.length;i++){
       for(int j=i+1;j<a.length;j++ ){

          if(a[i]<a[j]){
            temp=a[i];
           a [i]=a[j];
           a[j]=temp;


          }

       }
          
      }
     System.out.println();
      System.out.println("descending order");
    for(int i=0;i<a.length;i++){

      System.out.print(a[i]+" ");    
    }

  }  
}