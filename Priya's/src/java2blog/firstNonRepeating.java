package java2blog;

import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String[] args){
        String str ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        System.out.println("First non repeated character for String is : "+getNonRepeatedCharacter(str));
    }
    public static Character getNonRepeatedCharacter(String str){     
        char charaaray[]=str.toCharArray();
        for (int i=0; i<str.length();i++){
            if (str.lastIndexOf(charaaray[i]) == str.indexOf(charaaray[i]))
                return charaaray[i];
        }
    return null;
    }
}

