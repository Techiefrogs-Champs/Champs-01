package Strings;

public class CompareEquals {
    public static void main(String[] args) {
        String s1="Techie";
        char ch[]={'T','e','c','h','i','e'};
        String s2=new String(ch);
        String s3=new String("TECHIE");
        String s4="Phani";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equals(s4));

    }
}