package Arrays;

public class SmallestE {
    public static void main(String[] args) {  
  
    
        int [] arr = new int [] {25, 11, 7, 75, 56, 120, 31, 9};  
          
        int min = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  
}  