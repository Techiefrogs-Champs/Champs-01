1.	public class FibonacciSeriesEvenNumber { 
    2.	public static void main(String[] args) { 
    3.	int firstNumber = 0; 
    4.	int secondNumber = 2; 
    5.	System.out.print("Enter the number of elements in the Fibonacci Series : "); 
    6.	Scanner scan = new Scanner(System.in); 
    7.	int elementCount = scan.nextInt(); 
    8.	System.out.print(firstNumber + ", "); 
    9.	System.out.print(secondNumber + ", "); 
    10.	for (int i = 2; i < elementCount; i++) { 
    11.	int nextNumber = firstNumber + secondNumber; 
    12.	System.out.print(nextNumber + ", "); 
    13.	firstNumber = secondNumber; 
    14.	secondNumber = nextNumber; 
    15.	} 
    16.	System.out.print("..."); 
    17.	} 
    18.	} 
    