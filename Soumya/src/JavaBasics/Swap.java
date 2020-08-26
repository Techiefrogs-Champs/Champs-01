package JavaBasics;

public class Swap {
    static int n1 = 10;
    static int n2 = 20;
     static int temp;

    public static void main(String[] args) {
        System.out.println("BEFORE SWAP");
        System.out.println(n1);
        System.out.println(n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("AFTER SWAP");
        System.out.println(n1);
        System.out.println(n2);
    }
}