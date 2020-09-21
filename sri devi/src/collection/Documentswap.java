package collection;

public class Documentswap {
    public static void main(String[] args) {
        String s="first";
        String n="next";
        System.out.println("before swaping"+" "+s+" "+n);

        s=s+n;
        n=s.substring(0,s.length()-n.length());
        s=s.substring(n.length());
        System.out.println("after swaping:"+" "+s+" "+n);
    }
        

    
}
