/*Java Program to Capitalize the first character of each word in a String*/
package Strings;
class Capitalize1 {
    public static void main(String[] args) {
        String name = "techiefrogs";
        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1, name.length());
        firstLetter = firstLetter.toUpperCase();
        name = firstLetter + remainingLetters;
        System.out.println("Name: " + name);
    
      }
    
}