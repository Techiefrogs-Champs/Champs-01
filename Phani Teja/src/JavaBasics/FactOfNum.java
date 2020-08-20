package JavaBasics;

public class FactOfNum {
    public static void main(String[] args) {
        int i=1;
        int fact=1;
        int n=4;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+ n + " is "+fact);

    }
}