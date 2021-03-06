package java2blog.DynamicProgramming;

import java.util.Scanner;
 
public class LongestCommonSubs {
 
	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st word:");
		String A = scn.nextLine();
		System.out.println("Enter 2nd word:");
		String B = scn.nextLine();
 
		System.out.println(LCS(A, B));
	}
	public static int LCS(String A, String B) {

		int[][] dp = new int[A.length() + 1][B.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (A.charAt(i-1) == B.charAt(j-1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[A.length()][B.length()];
	}
 
}