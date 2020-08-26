
import java.util.Scanner;

public class Alphabet_not {
    public static void main(String args[])
    {
        char character;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        character = sc.next().charAt(0);
		
        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
        }else{
            System.out.print(character + " is not an alphabet.");
        }
    }

}