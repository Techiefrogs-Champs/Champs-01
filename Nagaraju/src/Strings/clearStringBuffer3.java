/*Java Program to Clear the StringBuffer by creating a new object*/
package Strings;
class clearStringBuffer3 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Java");
        str.append(" is");
        str.append(" awesome.");
        System.out.println("StringBuffer: " + str);
        str = new StringBuffer();
        System.out.println("Updated StringBuffer: " + str);
      }
    
}