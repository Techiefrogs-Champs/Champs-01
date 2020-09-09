/*Java Program to Compare String objects using ==  */
package Strings;
class CompareStrings3 {
    public static void main(String[] args) {

        String s1 = new String("Techie");
        String s2 = new String("Techie");

        if(s1 == s2)
            System.out.println("strings Equal");
        else
            System.out.println("strings Not Equal");
    }
    
}