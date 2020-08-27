package basicsprobles;

public class problem7 {
    public static void main(String[] args) {

        char c = 'r';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}