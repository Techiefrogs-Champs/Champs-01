package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        if(s1.length()==s2.length()){
            char[] arr1=s1.toCharArray();
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));
            boolean Answer= Arrays.equals(arr1, arr2);
            if(Answer){
                System.out.println(s1+" and "+s2+" are anagrams");
            }
            else{
                System.out.println(s1+" and "+s2+" are not anagrams");
            }
        }
    }
}