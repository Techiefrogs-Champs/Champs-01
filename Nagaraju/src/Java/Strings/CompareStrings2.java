/*Java Program to Compare Strings using equals() */
package Strings;
class CompareStrings2 {
    public static void main(String[] args) {

        String style = new String("Techie");
        String style2 = new String("Techie");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
    
}