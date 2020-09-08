/*Java Program to Check if two strings are anagram(using char arrays) */
package Strings;
import java.util.Arrays;

class Anagram {
  public static void main(String[] args) {
    String str1 = "A gentleman";
    String str2 = "Elegant man";

    if(str1.length() == str2.length()) {
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
    }
  }
}