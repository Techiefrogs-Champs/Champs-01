/*Java Program to Clear the StringBuffer using setLength() method*/
package Strings;
class clearStringBuffer2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Java");
        str.append(" is");
        str.append(" awesome.");
        System.out.println("StringBuffer: " + str);
        str.setLength(0);
        System.out.println("Updated StringBuffer: " + str);
      }
    
}