package Basicsamples;

public class SumNatural1 {

    public static void main(String[] args) {

        int num = 52, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}