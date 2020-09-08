package test;

public class test3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        
        do 
        {
            System.out.println("Enter the number");
            while (!sc.hasNextInt())
            {
                System.out.println("That's is not a number" );
                sc.next();
            }
            num = sc.nextInt();
        }
           while (num <=0);
            System.out.println("It's a number"+ num);
    
        int r, sum=0,
        temp=num; 
         while (num != 0)
         {
             r=num%10;
             sum =(sum*10)+r;
             num=num/10;
         }
         if(temp==sum)
         System.out.println("Palidrome number");
         else
          System.out.println("Not palidrome number");
         
    }
}