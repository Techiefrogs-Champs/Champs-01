import  java.util.*;
class PalindromeStr
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		int i;
		String str,rev="";
		System.out.println("enter the string");
		str=d.next();
		int l=str.length();
		for(i=l-1;i>=0;i--)
		rev =rev+str.charAt(i);
		if(str.equals(rev))
		{
			System.out.println("string is palindrme");
		}
		else
		{
			System.out.println("string is not a palindrome");
		}
	}
}	