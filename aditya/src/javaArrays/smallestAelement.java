package javaArrays;

public class smallestAelement {
     
        public static void main(String[] args) {  
      
            //Initialize array  
            int [] arr = {25, 11, 7, 5, 56};  
            //Initialize min with first element of array.  
            int min = arr[0];  
            //Loop through the array  
            for (int i = 0; i < arr.length; i++) {  
                //Compare elements of array with min  
               if(arr[i] <min)  
                   min = arr[i];  
            }  
            System.out.println("Smallest element present in given array: " + min);  
        }  
    }  
    
