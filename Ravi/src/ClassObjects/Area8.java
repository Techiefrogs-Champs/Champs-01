package src.ClassObjects;

import java.util.Scanner;

public class Area8 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = obj.nextDouble();
        System.out.print("Input the second number: ");
        double y = obj.nextDouble();
        System.out.print("Input the third number: ");
        double z = obj.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+ "\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}