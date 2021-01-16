package Arrays;


public class sumSubArray {
    public static void main(String[] args) {
		
		int[] arr = {2, 3, 6, 4, 9, 0, 11};
		int target = 9;
		
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
		}
		solve(arr, target);
	}
	
	public static void solve(int[] arr, int target){
		for(int start = 0; start < arr.length; start++){
			int currSum = 0;
			for(int end = start; end < arr.length; end++){
				currSum += arr[end];
				
				if(currSum == target){
				     System.out.println("starting index : " + start + ", " + "Ending index : " + end);
                                                         
				}
				
			}
		}
	}
}
