
/*In this challenge, you must read an integer, a double, and a String from stdin, 
then print the values according to the instructions in the Output Format section below. 
To make the problem a little easier, a portion of the code is provided for you in the editor.

Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

Input Format
There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, 
recall that nextInt() reads integer tokens; because of this, 
the last newline character for that line of integer input is 
still queued in the input buffer and the next nextLine() will be 
reading the remainder of the integer line (which is empty).*/

/*Explanation:
Invisible "\n" newlines
At the end of each line of the provided input, there is an invisible "\n" which is called a newline character. This basically represents what happens when you press the "Enter" key when typing.

1) The first scan.nextInt() grabs the first "int" from the input. It still leaves the "\n" on that line.

2) The second scan.nextDouble() skips over that "\n" and grabs the first "double" it sees.

3) Now is the tricky part. It turns out scan.nextLine() works differently than scan.nextInt() and scan.nextDouble() in that it doesn't skip over any "\n" newline characters. What it does is it reads and returns all characters until it reaches the "\n" (which it gets rid of), and stops. In the scenario above, since "\n" is the first thing we see, we get an empty String back on our 1st call to scan.nextLine().

4) Our next call to scan.nextLine() will start on line 3 of input and grab the String we want.*/
package HackerRank;
import java.util.Scanner;

class StdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer:");
        int i = scan.nextInt();
        System.out.println("Enter double:");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter string:");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
