public class operators {
 public static void main(String[] args) {
    int number1, number2; 
    number1 = 5;
    System.out.println(number1);   //Assignment Operator
    number2 = number1;
    System.out.println(number2);
   
    double number3 = 12.5, number4 = 3.5, result;
        result = number3 + number4;
        System.out.println("number3 + number4 = " + result);
        result = number3 - number4;
        System.out.println("number3 - number4 = " + result);
        result = number3 * number4;
        System.out.println("number3 * number4 = " + result);    //Arithmetic Operator
        result = number3 / number4;
        System.out.println("number3 / number4 = " + result);
        result = number3 % number4;
        System.out.println("number3 % number4 = " + result);


        int number5 = 7, number6 = 6;
        if (number5 > number6) {
            System.out.println("number1 is greater than number2.");
        }
        else {
            System.out.println("number2 is greater than number1.");
        }

        int number8 = 1, number9 = 2, number10 = 9;
        boolean yes ;
        yes = (number8 > number9) || (number10> number8);
        System.out.println(yes);
        yes = (number1 > number2) && (number10 > number8);
        System.out.println(yes);
        
    }
}