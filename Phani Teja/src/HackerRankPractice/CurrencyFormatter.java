package HackerRankPractice;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//import sun.nio.cs.US_ASCII;
    

public class CurrencyFormatter {
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double payment=sc.nextDouble();
        sc.close();

        NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us=usFormat.format(payment);
        String india=indiaFormat.format(payment);
        String china=chinaFormat.format(payment);
        String france=franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}