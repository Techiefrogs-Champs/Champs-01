package javaArrays;

public class largestN {
    static public void main(String []args){
        int arr[]={7,8,56,84,90};
       int max= arr[0];
      for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          }
        }
         System.out.println(max);
        
    }
    
}