package Strings;

public class Exchange {
    public static void main(String[] args) {
        String s="first";
        String s1="next";
        System.out.println("before swapping"+s+" "+s1);
    
        s=s+s1;
        s1=s.substring(0,s.length()-s1.length());
         s=s.substring(s1.length());
        System.out.println("afterswapping "+s+" "+s1);
    }
    
}
