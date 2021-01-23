package java2blog.Miscellaneous;
import java.util.Scanner;
import java.util.Stack;
 
public class maxHistogramArea {
 
	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		/* input number of bars in the histogram */
		int n = scn.nextInt();
		int[] a = new int[n];
		/* input height of each bar */
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		System.out.println(solve(a));
	}
 
	public static int solve(int[] a) {
		Stack<Integer> stack = new Stack<>();
		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < a.length;) {
			if (stack.isEmpty() || a[stack.peek()] <= a[i]) {
				stack.push(i);
				i++;
			} else {

				int top = stack.pop();
				if (stack.isEmpty()) {
					maxArea = Math.max(maxArea, a[top] * i);
				} else {
					maxArea = Math.max(maxArea, a[top] * (i - stack.peek()-1));
				}
			}
		}
 
		while (!stack.isEmpty()) {
			int top = stack.pop();
			if (stack.isEmpty()) {
				maxArea = Math.max(maxArea, a[top] * a.length);
			} else {
				maxArea = Math.max(maxArea, a[top] * (a.length - stack.peek()-1));
			}
		}
		return maxArea;
	}
 
}
