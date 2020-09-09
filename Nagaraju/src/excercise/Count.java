package excercise;
import java.util.Scanner;
class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str = sc.nextLine();
        System.out.println("Entered string is: "+str);

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println("char at "+i+"index is: "+c);
        }
    }
}

//check when you give input two liner