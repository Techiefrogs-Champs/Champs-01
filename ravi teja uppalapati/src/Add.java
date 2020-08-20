public class Add{
public static void main(String[] args) {
    
int a=1,b=5;
int c=10;
int d=add(a,b,c);
System.out.println("sum="+d);
}
public static int add(int num1,int num2,int num3){
    int sum=num1+num2+num3;
    return sum;
}

}