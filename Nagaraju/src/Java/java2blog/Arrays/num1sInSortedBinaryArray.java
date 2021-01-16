package Arrays;

public class num1sInSortedBinaryArray {
    public static void main(String[] args) {
		int arr[]= {0,0,0,0,1,1,1,1};
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
		}
		System.out.println("Number of 1's in array :"+solveEfficient(0, arr.length-1, arr));
	}
	public static int solveEfficient(int start, int end, int[] arr) {
		if (arr[start] == 1) {
			return end - start + 1;
		}
		if (arr[end] == 0) {
			return 0;
		}
		int mid = (start + end) / 2;
		int leftResult = solveEfficient(start, mid, arr);
		int rightResult = solveEfficient(mid + 1, end, arr);
		return leftResult + rightResult;
	}
}
