package arraysproblem;

public class array12 {
    public static void main(String[] args) {
        int [] arr4 = new int [] {25, 11, 7, 75, 56};  
         
        int sum = 0;  
       
        for (int i = 0; i < arr4.length; i++) {  
            sum = sum + arr4[i];  
         }  
         System.out.println("Sum of all the elements of an array: " + sum);   

    }
}