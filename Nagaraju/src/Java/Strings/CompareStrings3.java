/*Java Program to Compare String objects using ==  */
package Strings;
class CompareStrings3 {
    public static void main(String[] args) {

        String style = new String("Techie");
        String style2 = new String("Techie");

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
    
}