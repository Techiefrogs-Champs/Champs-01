package src.LoopExec;

public class Two {

    public static void main(String[] args) {

        int rows = 5;

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }






        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        char  First = 'A',last = 'E';

        for(int i = 1; i <= (last-'A'+1); ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(First);
            }
            ++First;

            System.out.println();
        }

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//......
        int rows1 = 5, k = 0;

        for(int i = 1; i <= rows1; i++, k = 0) {
            for(int j = 1; j <= rows1 - i; j++) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }



        int rows2 = 5, k1 = 0, c1 = 0, c2 = 0;

        for(int i = 1; i <= rows2; i++) {
            for(int j = 1; j <= rows2 - i; j++) {
                System.out.print("  ");
                c1++;
            }

            while(k1 != 2 * i - 1) {
                if (c1 <= rows2 - 1) {
                    System.out.print((i + k1) + " ");
                    c1++;
                }
                else {
                    c2++;
                    System.out.print((i + k1 - 2 * c2) + " ");
                }

                k1++;
            }
            c2 = c1 = k1 = 0;

            System.out.println();
        }




        int rows3 = 5;

        for(int i = rows3; i >= 1; i--) {
            for(int j = 1; j <= rows3 - i; j++) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }



        int rows4 = 6, c3 = 1;

        for(int i = 0; i < rows4; i++) {
            for(int space = 1; space < rows4 - i; ++space) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                c3 = 1;
                else
                c3 = c3 * (i - j + 1) / j;

                System.out.printf("%4d", c3);
            }

            System.out.println();
        }



        int rows5 = 4, number = 1;

        for(int i = 1; i <= rows5; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }


        int i, j, k13;
            for(i=1;i<=5;i++)
            {
                for(j=i;j<5;j++)
                {
                    System.out.print(" ");
                }
                for(k13=1;k13<(i*2);k13++)
                {
                    System.out.print("*");
                }
                    System.out.println();
            }
            // for(i=4;i>=1;i--)
            // {
            //     for(j=5;j>i;j--)
            //     {
            //         System.out.print(" ");
            //     }
            //     for(k13=1;k13<(i*2);k13++)
            //     {
            //         System.out.print("*");
            //     }
            //         System.out.println();
            // }


         //Right Pascal's Triangle
       
    
         int row = 5, iii, jjj;       
         for (iii= 1; iii<= row-1; iii++)  
         {  
            for (jjj=1; jjj<=iii; jjj++)   
            {  
                System.out.print("*" + " ");  
            }   
                System.out.println("");   
        }  

         for (iii=row-1; iii>=0; iii--)  
         {  
            for(jjj=0; jjj <= iii-1; jjj++)  
            {  
                System.out.print("*"+ " ");  
            }  
                System.out.println("");  
         }  


         //Left Pascal's Triangle
         int I, J, k11;  
        
         int rws = 10;      
         for (I= 1; I<= rws ; I++)  
         {  
            for (J=I; J <rws; J++)              
            {  
                System.out.print(" ");  
            }  
            for (k11=1; k11<=I;k11++)   
            {  
                System.out.print("*");   
            }   
                System.out.println("");   
            }    
         for (I=rws; I>=1; I--)  
         {  
            for(J=I; J<=rws; J++)  
            {  
            System.out.print(" ");  
            }  
            for(k11=1; k11<I; k11++)   
            {  
            System.out.print("*");  
            }  
            System.out.println("");  
         }  

         //Sandglass Star Pattern

         int i1, j1, k12, N=10;  
                   
         for (i1= 0; i1<= N-1 ; i1++)  
         {  
            for (j1=0; j1<i1; j1++)  
            {  
                System.out.print(" ");  
            }  
            for (k12=i1; k12<=N-1; k12++)   
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
            for (k12=i1; k12<=N-1; k12++)  
            {  
                System.out.print("*" + " ");  
            }  
                System.out.println("");  
         }  


    }
    
}