

import java.util.Scanner;
public class Vowel_Consonant {
    
    public static void main(String[] args) {
        String ch;
        Scanner c= new Scanner(System.in);
        System.out.println("Enter a alphabet character: ");
        ch = c.next();
        c.close();
        switch (ch) {
            case "a":
            System.out.println(ch + " is vowel");
            break;
            case "ë":
            System.out.println(ch + " is vowel");
            break;
            case "i":
            System.out.println(ch + " is vowel");
            break;
            case "o":
            System.out.println(ch + " is vowel");
            break;
            case "u":
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}