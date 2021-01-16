package Strings;
import java.util.Scanner;

public class rotaionString {
    public static void main(String[] args) {
		String wrd1, wrd2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word:");
        wrd1 = sc.nextLine();
        System.out.println("Enter 2nd word:");
        wrd2 = sc.nextLine();
        System.out.println("two strings are rotation of each other: "+isRotation(wrd1,wrd2));
	}
	public static boolean isRotation(String str, String rotation) {
		String str2 = str + str;
		if (str2.contains(rotation)) {
			return true;
		}
		return false;
	}
}

