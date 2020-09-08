/*14.	Java Program to Handle Array IndexOutOfBoundException*/
package Exception_1;


public class Except_14 {
    
    public static void main(String[] args) {
        char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};
        System.out.println(matrix);

        /* Print each letter of the char array in a separate line. */
        for(int i = 0; i <= matrix.length; ++i) {
             System.out.println(matrix[i]);
        }
   }

}