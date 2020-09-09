package arraysproblem;

public class array7 {
    public static void main(String[] args) {
        int [] ar3 = new int [] {1, 2, 3, 4, 5,6,7,8};  
  
        System.out.println("Elements of given array present on even position: ");  
        for (int i = 1; i < ar3.length; i = i+2) {  
            System.out.println(ar3[i]);  
        } 
        System.out.println();
    }
}