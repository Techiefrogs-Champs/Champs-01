package JavaBasics;

public class QuoAndRem {
    static int n1 = 10;
    static int n2 = 5;
    static int quotient;
    static int reminder;

    public static void main(String[] args) {
        quotient = n1 / n2;
        reminder=n1%n2;
        System.out.println("Quotient of two numbers is :"+quotient);
        System.out.println("Reminder of two numbers is :"+reminder);

    }
}