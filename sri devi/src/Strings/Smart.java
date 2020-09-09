import java.util.Scanner;

public class Smart { 
    public static void main(String[] args) {
        
    int num1,num2,lcm;
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the first number");
    num1=sc.nextInt();
    System.out.println("please enter second number");
    num2=sc.nextInt();
    lcm=(num1>num2)?num1:num2;
    while(true){
    if(lcm%num1==0 && lcm%num2==0){
        System.out.println(lcm);
        break;  
    }
     lcm++;
}
}
}