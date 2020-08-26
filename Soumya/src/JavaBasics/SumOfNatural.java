package JavaBasics;

public class SumOfNatural {
    public static void main(String[] args) {
        int sum=0;
        int i;
        int n=4;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of " + n +" is " +sum);

    }
}