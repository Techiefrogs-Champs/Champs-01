package java2blog.DynamicProgramming;
import java.util.Arrays;
 
public class minJumpsArr {
 
	public static void main(String[] args) {
		int[] A = { 2, 0, 1, 1, 4 };
 
		int ans = solveDP(A);
		if(ans == Integer.MAX_VALUE){
			System.out.println("Not Possible");
		}
		else {
			System.out.println(ans);
		}
 
	}
 
	public static int solveDP(int[] a) {
        int[] minJumps = new int[a.length];
		Arrays.fill(minJumps, Integer.MAX_VALUE);
		minJumps[0] = 0;
	
		for (int i = 0; i < a.length; i++) {
			int maxJump = a[i];
			for (int j = 1; j <= maxJump; j++) {
				
				int reachableIdx = i + j;
				if (reachableIdx < a.length && minJumps[i] != Integer.MAX_VALUE) {
				minJumps[reachableIdx] = Math.min(minJumps[reachableIdx], minJumps[i] + 1);
				}
			}
		}
		return minJumps[a.length-1];
    }
}
 
