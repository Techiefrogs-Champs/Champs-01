package HackerRankPractice.AdvanceExamples;

public class removeDupliChar 
{
    public static void main(String[] args) 
    {
        String str1 = "helloeveryone";
        System.out.println("The given string is: " + str1);
        System.out.println("After removing duplicates chars the given string : " + removeDuplicateChars(str1));
       }
       private static String removeDuplicateChars(String sourceStr) {
        char[] arr1 = sourceStr.toCharArray();
        String targetStr = "";
        for (char value: arr1) {
         if (targetStr.indexOf(value) == -1) {
          targetStr += value;
         }
        }
        return targetStr;    
    }
}
