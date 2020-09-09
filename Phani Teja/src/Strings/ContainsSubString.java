package Strings;

public class ContainsSubString {
    public static void main(String[] args) {
        String main="Techie Frogies syllabys week 2";
        String s1="week 1";
        String s2="week 2";
        boolean answer=main.contains(s1);
        if(answer){
            System.out.println(s1+" is present in String1");
        }
        else{
            System.out.println(s1+" is not present in string1");
        }
         answer=main.contains(s2);
        if(answer){
            System.out.println(s2+" is present in string2");
        }
        else{
            System.out.println(s2+" is not present in string1");
        }

    }
}