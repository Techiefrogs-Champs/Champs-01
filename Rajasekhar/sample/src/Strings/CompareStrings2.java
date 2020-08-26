/*Java Program to Compare Strings using equals() */
package Strings;

class CompareStrings2 {
    public static void main(String[] args) {

        String s1 = new String("Techie");
        String s2 = new String("Techie");

        if(s1.equals(s2))
            System.out.println("Strings Equal");
        else
            System.out.println("Strings Not Equal");
    }
    
}