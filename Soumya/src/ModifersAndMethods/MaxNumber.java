package ModifersAndMethods;

public class MaxNumber {
    public static void main (String[] args){
        int a=59;
        int b=36;
        int c=maxFunction(a,b);
        System.out.println("maximun number is :"+c);
  
    }
    public static int maxFunction(int n1,int n2) {
        int max;
        if(n1>n2)     
        max=n1;
        else
        max=n2;
        return max;   
    }
}