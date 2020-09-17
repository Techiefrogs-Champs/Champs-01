package excercise;
import java.util.Scanner;

class TwoPairComplete {
    
    static int validate() {
        Scanner sc = new Scanner(System.in); 
        int sum;

    do { 
        while (!sc.hasNextInt()) {
            String input = sc.next();
            
            System.out.println("That's not a number!");  
        } 
        sum = sc.nextInt(); 
    } 
    while (sum <= 0); 
    return sum;
    
}
public static void findPair(int[] A,int n, int sum){
    // consider each element except last element
    for (int i = 0; i < n; i++){
        // start from i'th element till last element
        for (int j = i + 1; j < n; j++){
            // if desired sum is found, print it and return
            if(A[i] + A[j] == sum){
                System.out.println("Pair found at index " + i + " and " + j);
                System.out.println("Pair of numbers are " + A[i] + " and " + A[j]);
            
            }
        }
    }
    // No pair with given sum exists in the array
    System.out.println("Pair not found");
}
public static void main (String[] args) {
    int[] A = { 8, 7, 2, 5, 3, 1 };
    int n=A.length;
    int sum=0;

    findPair(A,n,sum);
}
}
