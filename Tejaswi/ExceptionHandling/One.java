import java.util.*;
 class One
 {
    public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value");
        int i=sc.nextInt();
        System.out.println("enter the second value");
            int j=sc.nextInt();
            int sum=i+j;
            try
            {
                sum=i+j;
            }
            catch(Exception e){
                System.out.println(i+j);
            }
        System.out.println("the value is= " +sum  );
    }
} 