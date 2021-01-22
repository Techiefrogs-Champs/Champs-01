package java2blog;

import java.util.Scanner;

public class uniqueCharString {
    public static void main(String[] args) {
        String wrd ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check unique char:");
        wrd = sc.nextLine();
        System.out.println("Given string has all unique chars : "+ hasAllUniqueChars(wrd));
    }
    public static boolean hasAllUniqueChars (String word) {
        for(int index=0;index < word.length(); index ++)   {
            char c =word.charAt(index);
            if(word.indexOf(c)!=word.lastIndexOf(c))
                return false;
        }
        return true;
    }
}
