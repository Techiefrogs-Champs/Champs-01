package arraysproblem;

public class array4 {
    public static void main(String[] args) {
        int [] ar1 = new int [] {1, 4, 2, 7, 8, 8, 3, 7, 3, 6, 2};  
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < ar1.length; i++) {  
            for(int j = i + 1; j < ar1.length; j++) {  
                if(ar1[i] == ar1[j])  
                    System.out.println(ar1[j]);  
                }  
        }  
        System.out.println();  
    
    }
    
}