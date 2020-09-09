package arraysproblem;

public class array13 {
    public static void main(String[] args) {
        int [] arr5 = new int [] {1, 2, 3, 4, 5};           
         int n1 = 3;    
            
         System.out.println("Original array: ");    
         for (int i = 0; i < arr5.length; i++) {     
             System.out.print(arr5[i] + " ");     
         }        
        
         for(int i = 0; i < n1; i++){    
             int j, last;    
              
             last = arr5[arr5.length-1];    
             
             for(j = arr5.length-1; j > 0; j--){    
                
                 arr5[j] = arr5[j-1];    
             }    
              
             arr5[0] = last;    
         }    
         
         System.out.println();    
             
       
         System.out.println("Array after right rotation: ");    
         for(int i = 0; i< arr5.length; i++){    
             System.out.print(arr5[i] + " ");    
         } 
    }
}