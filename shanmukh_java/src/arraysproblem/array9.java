package arraysproblem;

public class array9 {
    public static void main(String[] args) {
        int [] arr4 = new int [] {25, 11, 7, 75, 56};  
        int max = arr4[0]; 
    
       
        for (int i = 0; i < arr4.length; i++) {  
            if(arr4[i] > max)  
               max = arr4[i];  
        }  
        System.out.println("Largest element present in given array: " + max); 

        for (int i = 0; i < arr4.length; i++) {  
            if(arr4[i] < max)  
               max = arr4[i];  
        }  
    }
}