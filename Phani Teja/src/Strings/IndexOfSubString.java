package Strings;

public class IndexOfSubString {
    public static void main(String[] args) {
        String main="Techie Frogies syllabys week 1";
        String s1="week 1";
        String s2="week 2";
        int answer = main.indexOf(s1);
        if(answer==-1){
            System.out.println(s1+" not present in string 1");
        }
        else{
            System.out.println(s1+" is present in String1");
        }
        answer=main.indexOf(s2);
        if(answer==-1){
            System.out.println(s2+" not present in string 2");
        }
        else{
            System.out.println(s2+" is present in String 2");

        }
    }
} 