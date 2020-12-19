/*Java Program to Iterate through each characters of the string – using for loop*/
package Strings;
class Loop1 {
    public static void main(String[] args) {
        String name = "Techiefrogs";
        System.out.println("Characters in " + name + " are:");
        for(int i = 0; i<name.length(); i++) {
          char a = name.charAt(i);
          System.out.print(a + ", ");
        }
      }
    
}