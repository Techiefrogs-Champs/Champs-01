/*Java Program to Check if a string contains a substring using contains()*/
package Strings;
class SubString1 {
    public static void main(String[] args) {
        String txt = "This is Techiefrogs";
        String str1 = "Techiefrogs";
        String str2 = "Students";
        boolean result = txt.contains(str1);
        if(result) {
          System.out.println(str1 + " is present in the string.");
        }
        else {
          System.out.println(str1 + " is not present in the string.");
        }
    
        result = txt.contains(str2);
        if(result) {
          System.out.println(str2 + " is present in the string.");
        }
        else {
          System.out.println(str2 + " is not present in the string.");
        }
      }
}