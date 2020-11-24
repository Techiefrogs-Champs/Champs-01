package excercise;
import java.util.Scanner;

class TwoPair{
	// Naive method to find a pair in an array with given sum
	public static void findPair(int[] A,int n, int sum){
		// consider each element except last element
		for (int i = 0; i < n; i++){
			// start from i'th element till last element
			for (int j = i + 1; j < n; j++){
				// if desired sum is found, print it and return
				if(A[j] == sum-A[i]){
					System.out.println("Pair found at indices " + i + " and " + j);
					System.out.println("Pair of numbers are " + A[i] + " and " + A[j]);
				}
			}
		}
		System.out.println("Not such pair exists");
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		boolean isNumber;

		do{
			System.out.println("Enter an integer number: ");
			if(sc.hasNextInt()){
				sum = sc.nextInt();
				isNumber = true;
			}
			else{
				System.out.println("Not an integer");
				isNumber=false;
				sc.next();
			}
		}
		while(!(isNumber));
		System.out.println(sum);

		int A[] = { 1, 5, 7, -1, 5 }; 
        int n = A.length; 
		findPair(A,n,sum);
	}
}