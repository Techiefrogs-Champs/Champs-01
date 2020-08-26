package Smethods;

public class Method3 {
    static int rectangle(int l, int b) {
        return l+b;
    }
    static int square(int s) {
        return s*s;
    }
    public static void main(String[] args) {
        System.out.println(rectangle(10,10));
        System.out.println(square(10));
    }
}