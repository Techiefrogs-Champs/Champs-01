package arraysproblem;

public class array14 {
    public static void main(String[] args) {
        int [] arr6 = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
          
        for (int i = 0; i < arr6.length; i++) {     
            for (int j = i+1; j < arr6.length; j++) {     
               if(arr6[i] > arr6[j]) {    
                   temp = arr6[i];    
                   arr6[i] = arr6[j];    
                   arr6[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
      
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr6.length; i++) {     
            System.out.print(arr6[i] + " ");    
        }    SS
    }
}