public class End8 {
    
 public static void main(String[] args) {
     int a[][]={{1,2,3},{4,5,6},{7,8,9}};

  int rows=a.length;
  int cols=a[0].length;
   int countOdd=0;
   int countEven=0;

  for(int i=0;i<rows;i++){
   for(int j=0;j<cols;j++){

    if(a[i][j]%2==0)

      countEven++;  
    
   else

   countOdd++;

   }


}
System.out.println("frequency of odd number  s"+countOdd);

System.out.println("frequency of even number  "+countEven);
  




 }







}