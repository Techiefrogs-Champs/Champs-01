package Strings;

public class CaseReplace {
    public static void main(String[] args) {
        String s="Killer Phani";
        StringBuffer newS=new StringBuffer(s);
        for(int i=0;i<s.length();i++){
        if(Character.isLowerCase(s.charAt(i))){
            newS.setCharAt(i, Character.toUpperCase(s.charAt(i)));
        }
        else if(Character.isUpperCase(s.charAt(i))){
            newS.setCharAt(i, Character.toLowerCase(s.charAt(i)));
        }

    }
    System.out.println(newS);
    }
}