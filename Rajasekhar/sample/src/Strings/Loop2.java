/*Java Program to Iterate through each characters of the string – using for-each loop*/
package Strings;

public class Loop2 {
    public static void main(String[] args) {
        String name = "Techiefrogs";
        System.out.println("Characters in string \"" + name + "\":");
        for(char c : name.toCharArray()) {
          System.out.print(c + ", ");
        }
      } 
}