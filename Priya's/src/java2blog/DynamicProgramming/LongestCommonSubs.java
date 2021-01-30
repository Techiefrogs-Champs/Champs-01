package java2blog.DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubs {
 
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the 1st word: ");
        String A = scn.nextLine();
        System.out.println("Enter the 2nd word: ");
		String B = scn.nextLine();
		
		System.out.println(LCS(A, B));
 
	}
	
	public static int LCS(String A, String B)
	{
		if(A.length()==0||B.length()==0)
		{
			return 0;
		}
		String remA = A.substring(1);
		String remB = B.substring(1);
		if(A.charAt(0)==B.charAt(0))
		{
			int remRes = LCS(remA, remB);
			return 1 + remRes;
		}
		else {
			int remRes = Math.max(LCS(remA, B), LCS(A, remB));
			return remRes;
		}
	}
 
}
