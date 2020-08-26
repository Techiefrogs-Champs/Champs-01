package Smethods;

class PrintNumber {
    public static void Printn(int n){
        System.out.println(n);
    }
    public static void Printn(float n) {
        System.out.println(n);
    }
    public static void Printn(double n) {
        System.out.println(n);
    }
    public static void Printn(long n) {
        System.out.println(n);
    }
}
public class Method1 {
    public static void main(String[] args)
    {
        PrintNumber.Printn(5);
    }
}