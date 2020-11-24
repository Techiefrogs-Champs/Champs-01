package Patterns;

public class JavaExample {
    public static void main(String[] args) {

        int count = 7, num1 = 0, num2 = 1;
        int even=0,odd=0;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            if (num1%2==0 || num2%2==0) {
                even++;
            }
            else
            odd++;
        }
        System.out.println(even);
	    System.out.println(odd);
        
    }

    
}
