/* Create a class to print an integer and a character with two methods having the same name 
    but different sequence of the integer and the character parameters.
    For example, if the parameters of the first method are of the form (int n, char c),
    then that of the second method will be of the form (char c, int n).  */


package src.Task_Methods;

class Integer_1 {
    int number;
    char charector;
    void method_1(int n,char c){
        number=n;
        charector=c;
        System.out.println("number is   "+number+"\nchatecter is  "+charector);

    }
    void method_1(char c,int n){
        charector=c;
        number=n;
        System.out.println("chatecter is  " +charector+"\nnumber is  "+number);
    }
    
}
public class Method_2{
    public static void main(String[] args)
    {
        Integer_1 i=new Integer_1();
        i.method_1(12,'e');
        i.method_1('f',6);
    }
}