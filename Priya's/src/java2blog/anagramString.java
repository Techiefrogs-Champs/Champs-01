package java2blog;

import java.util.Scanner;

class anagramString {
    public static void main(String[] args) {
        String wrd1, wrd2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word:");
        wrd1 = sc.nextLine();
        System.out.println("Enter 2nd word:");
        wrd2 = sc.nextLine();
        System.out.println("two words are anagrams: "+anagram(wrd1,wrd2));
    }
    public static boolean anagram(String wrd1, String wrd2) {
        if(wrd1.length() != wrd2.length())
        return false;
        for(int i=0; i<wrd1.length();i++){
            char c = wrd1.charAt(i);
            int index = wrd2.indexOf(c);

            if(index != -1) {
                wrd2 = wrd2.substring(0, index)+wrd2.substring(index+1, wrd2.length());
            }
            else
            return false;
        }
        return wrd2.isEmpty();
    }
}
