package src.LoopExec;


public class One {
    public static void main(String args[])
    {

    // Java Program to Add Two Integers
        int a=10,b=20;
        int num1=10,num2=2;

        System.out.println(a);
        System.out.println(b);

    // Java Program to Compute Quotient(/) and Remainder(%)
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
        
    // Java Program to Swap Two Number
        int first = 12, second = 24;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second); 
        
    //	Java Program to Check Whether a Number is Even or Odd  
        int x=3;
        if(x%2==0){
            System.out.println("EVEN Number");
        } else{
            System.out.println("ODD Number");
        }

    // 	Java Program to Check Whether an Alphabet is Vowel or Consonant
        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");


    // Java Program to Find the Largest Among Three Numbers
        int nu1 = 10, nu2 = 20, nu3 = 7;

        if( nu1 >= nu2 && nu1 >= nu3)
            System.out.println(nu1+" is the largest Number");

        else if (nu2 >= nu1 && nu2 >= nu3)
            System.out.println(nu2+" is the largest Number");

        else
            System.out.println(nu3+" is the largest Number");

    // Java Program to Check Whether a Character is Alphabet or Not
        char c = 'A';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

    // Java Program to Find Factorial of a Number 
        int i,fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of Loop using "+number+" is: "+fact);    

        while(i<=number){
            fact=fact*i;
            i++;
        } 
        System.out.println("Factorial of  While using"+number+" is: "+fact);    

    // 	Java Program to Calculate the Sum of Natural Numbers  
        int num=100,sum=0;
        for(i=1; i<=num; i++){
            sum +=i;
        }
        System.out.println("Sum of using For Loop = " + sum);

        while(i<=num){
            sum=sum+i;
            i++;
        } 
        System.out.println("Sum of using While Loop = " + sum);

    //  Java Program to Generate Multiplication Table using for or while loop
        int num11 = 5;
        for(i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num11, i, num11 * i);
        }

        int ii = 1,num12 = 9 ;
        while(ii <= 10)
        {
            System.out.printf("%d * %d = %d \n", num12, ii, num12 * ii);
            ii++;
        }

    // Find GCD of two numbers using for loop and if statement
        int n1 = 81, n2 = 153, gcd = 1;

        for(int f = 1; f <= n1 && f <= n2; ++f)
        {
            // Checks if i is factor of both integers
            if(n1 % f==0 && n2 % f==0)
                gcd = f;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);

    // using while loop and if else statement
            int n11 = 81, n22 = 153;

            while(n11 != n22)
            {
                if(n11 > n22)
                    n11 -= n22;
                else
                    n22 -= n11;
            }
            System.out.println("G.C.D = " + n11);



        // LCM using while Loop and if Statement
            int n12 = 72, n23 = 120, lcm;
            lcm = (n12 > n23) ? n12 : n23;
     
            while(true) {
              if( lcm % n12 == 0 && lcm % n12 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n12, n23, lcm);
                break;
              }
              ++lcm;
            }


    // Java Program to Display Characters from A to Z using loop  
        char z;

        for(z = 'A'; z <= 'Z'; ++z)
            System.out.print(z + " ");
        char y;

        for(y = 'a'; y <= 'z'; ++y)
         System.out.print(y + " ");


         //Prime Number Program in Java
                int ix =0;
                int numx =0;
                String  primeNumbers = "";
         
                for (ix = 1; ix <= 100; ix++)         
                { 		  	  
                   int counter=0; 	  
                   for(numx =ix; numx>=1; numx--)
               {
                      if(ix%numx==0)
                  {
                  counter = counter + 1;
                  }
               }
               if (counter ==2)
               {
                  primeNumbers = primeNumbers + ix + " ";
               }	
                }	
                System.out.println("Prime numbers from 1 to 100 are :");
                System.out.println(primeNumbers);

                //⦁Palindrome Program in Java

                int n=1234521, rev=0, rem, temp;

                temp = n;
        
                for( ;n != 0; n /= 10 )
                {
                    rem = n % 10;
                    rev= rev* 10 + rem;
                }
                if(temp== rev)
                    System.out.println(temp + " is a palindrome.");
                else
                    System.out.println(temp + " is not a palindrome.");


                    
                //Right Pascal's Triangle
                int iii, j;  
                System.out.print("Right Pascal's Triangle");  
                int row = 8;       
                for (iii= 0; iii<= row-1; iii++)  
                {  
                for (j=0; j<=iii; j++)   
                {  
                System.out.print("*"+ " ");  
                }   
                System.out.println("");   
                }   
                for (iii=row-1; iii>=0; iii--)  
                {  
                for(j=0; j <= iii-1;j++)  
                {  
                System.out.print("*"+ " ");  
                }  
                System.out.println("");  
                }  


                //Left Pascal's Triangle
                int I, J, k;  
                System.out.print("Left Pascal's Triangle");  
                int rows = 10;      
                for (I= 1; I<= rows ; I++)  
                {  
                for (J=I; J <rows; J++)              
                {  
                System.out.print(" ");  
                }  
                for (k=1; k<=I;k++)   
                {  
                System.out.print("*");   
                }   
                System.out.println("");   
                }   
                for (I=rows; I>=1; I--)  
                {  
                for(J=I; J<=rows; J++)  
                {  
                System.out.print(" ");  
                }  
                for(k=1; k<I ;k++)   
                {  
                System.out.print("*");  
                }  
                System.out.println("");  
                }  

                //Sandglass Star Pattern
                int i1, j1, k1, N=10;  
                
                System.out.print("Sandglass Star Pattern");  
                          
                for (i1= 0; i1<= N-1 ; i1++)  
                {  
                    for (j1=0; j1<i1; j1++)  
                    {  
                        System.out.print(" ");  
                    }  
                    for (k1=i1; k1<=N-1; k1++)   
                    {   
                        System.out.print("*" + " ");   
                    }   
                        System.out.println("");   
                }   
                for (i1= N-1; i1>= 0; i1--)  
                {  
                    for (j1=0; j1<i1; j1++)  
                    {  
                        System.out.print(" ");  
                    }  
                    for (k1=i1; k1<=N-1; k1++)  
                    {  
                        System.out.print("*" + " ");  
                    }  
                        System.out.println("");  
                }  
    }      
}