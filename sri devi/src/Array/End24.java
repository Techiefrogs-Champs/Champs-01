public class End24 {
   public static void main(String[] args) {
      
     int a[]={5,8,6,4,9,2,7};
     int temp=0;
     for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;

        }

      }


     }
     
     System.out.println();
     System.out.println("this ascending order of array sorted");
     for(int i=0;i<a.length;i++){

        System.out.print(a[i]);

     }

   } 
}