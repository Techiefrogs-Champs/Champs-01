import java.util.Arrays;

public class doc {
    
    //1
    static void printPairs(int arr[],int n, int sum) 
    { 

        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                if (arr[i] + arr[j] == sum) 
            System.out.println("(" + arr[i] + ", " + arr[j] + ")"); 
    } 
    //4
    static int sortRowWise(int m[][]) 
    { 
        // loop for rows of matrix 
        for (int i = 0; i < m.length; i++) { 
  
            // loop for column of matrix 
            for (int j = 0; j < m[i].length; j++) { 
  
                // loop for comparison and swapping 
                for (int k = 0; k < m[i].length - j - 1; k++) { 
                    if (m[i][k] > m[i][k + 1]) { 
  
                        // swapping of elements 
                        int t = m[i][k]; 
                        m[i][k] = m[i][k + 1]; 
                        m[i][k + 1] = t; 
                    } 
                } 
            } 
        } 
  
        // printing the sorted matrix 
        for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        } 
  
        return 0; 
    } 
    //8
    private static String removeDuplicateChars(String sourceStr) {
        char[] chrArray = sourceStr.toCharArray();
        String targetStr = "";
 
       
        for (char value : chrArray) {
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; 
            }
        }
        return targetStr;
    }
    static int wordcount(String string)  
        {  
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  

        //16
        public static int divide(int x, int y)
        {
            // handle divisibility by 0
            if (y == 0)
            {
                System.out.printf("Error!! Divisible by 0");
                System.exit(1);
            }
    
            // store sign of the result
            int sign = 1;
            if (x * y < 0) {
                sign = -1;
            }
    
            // convert both dividend and divisor to positive
            x = Math.abs(x);
            y = Math.abs(y);
    
            // initialize quotient by 0
            int quotient = 0;
    
            // loop till dividend x is more than the divisor y
            while (x >= y) {
                x = x - y;		// perform reduction on dividend
                quotient++;		// increase quotient by 1
            }
    
            System.out.println("Remainder is " + x);
            return sign * quotient;
        }

        //17
        static boolean arePermutation(String str1, String str2)  
            {  
            
                int n1 = str1.length();  
                int n2 = str2.length();  
            
            
                if (n1 != n2)  
                return false;  
                char ch1[] = str1.toCharArray(); 
                char ch2[] = str2.toCharArray(); 
            
            
                Arrays.sort(ch1);  
                Arrays.sort(ch2);  
            
            
                for (int i = 0; i < n1; i++)  
                if (ch1[i] != ch2[i])  
                    return false;  
            
                return true;  
            }  

            //19
            static int CommomSubsequencesCount(String s, String t)  
            {  
                int n1 = s.length();  
                int n2 = t.length();  
                int dp[][] = new int [n1+1][n2+1];  
                char ch1,ch2 ; 
                
                for (int i = 0; i <= n1; i++) {  
                    for (int j = 0; j <= n2; j++) {  
                        dp[i][j] = 0;  
                    }  
                }  
                
                // for each character of S  
                for (int i = 1; i <= n1; i++) {  
                
                    // for each character in T  
                    for (int j = 1; j <= n2; j++) {  
                          
                        ch1 = s.charAt(i - 1); 
                        ch2 = t.charAt(j - 1); 
                          
                        // if character are same in both   
                        // the string                  
                        if (ch1 == ch2)   
                            dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j];              
                        else 
                            dp[i][j] = dp[i][j - 1] + dp[i - 1][j] -   
                                                    dp[i - 1][j - 1];              
                    }  
                }  
                
                return dp[n1][n2];  
            }

                      //20

                      static int getSingle(int arr[], int n) 
                      { 
                          int ones = 0, twos = 0; 
                          int common_bit_mask; 
                  
                          for (int i = 0; i < n; i++) { 
                              twos = twos | (ones & arr[i]); 
                              ones = ones ^ arr[i]; 
                              common_bit_mask = ~(ones & twos); 
                  
                          
                              ones &= common_bit_mask; 
                  
                          
                              twos &= common_bit_mask; 
                          } 
                          return ones; 
                      }

            //21
            static int smallest(int x, int y, int z) 
            { 
                int c = 0; 
          
                while (x != 0 && y != 0 && z != 0) { 
                    x--; 
                    y--; 
                    z--; 
                    c++; 
                } 
          
                return c; 
            } 
   

            //22
            public static int findMin(int x, int y)
            {
                return y ^ ((x ^ y) & -((x < y) ? 1 : 0));
            }

            public static int findMax(int x, int y)
            {
                return x ^ ((x ^ y) & -((x < y) ? 1 : 0));
            }

            //23
            static int findSingle(int ar[], int ar_size) 
                { 
                
                    int res = ar[0]; 
                    for (int i = 1; i < ar_size; i++) 
                        res = res ^ ar[i]; 
                
                    return res; 
                }
                

            //24
            static int swapBits(int x) 
            { 
                
                int even_bits = x & 0xAAAAAAAA;  
              
              
                int odd_bits = x & 0x55555555;  
              
               
                even_bits >>= 1;  
                  
              
                odd_bits <<= 1;  
                  
            
                return (even_bits | odd_bits);  
            } 
        

    public static void main(String[] arg) {
  
        //1    
        { 
            int arr[] = { 1, 5, 7, -1, 5, 8}; 
            int n = arr.length; 
            int sum = 6; 
            printPairs(arr, n, sum); 
        }


        

        //2
        int [] arr6 = new int [] { 1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};    
        int temp = 0;  
        for (int i1 = 0; i1 < arr6.length; i1++) {     
            for (int j = i1+1; j < arr6.length; j++) {     
               if(arr6[i1] > arr6[j]) {    
                   temp = arr6[i1];    
                   arr6[i1] = arr6[j];    
                   arr6[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
      
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i1 = 0; i1 < arr6.length; i1++) {     
            System.out.print(arr6[i1] + " ");    
        }   
        System.out.println();    
            
        //3
        String str1 = "welcome";
        char temp1 = 0;

        char arr[] = str1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();    
            
        
        //4
        int m[][] = { { 9, 8, 7, 1 }, 
                      { 7, 3, 0, 2 }, 
                      { 9, 5, 3, 2 }, 
                      { 6, 3, 1, 2 } }; 
        sortRowWise(m); 
        System.out.println(); 

        //6

        String a = "Ravi";  
        String b = "Teja";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  

        //7
        String str = "The quick brown fox jumps over the lazy dog.";

        // Get the index of all the characters of the alphabet
        // starting from the beginning of the String.
        int a1 = str.lastIndexOf("a", str.length() - 1);
        int b1 = str.lastIndexOf("b", str.length() - 1);
        int c = str.lastIndexOf("c", str.length() - 1);
        int d = str.lastIndexOf("d", str.length() - 1);
        int e = str.lastIndexOf("e", str.length() - 1);
        int f = str.lastIndexOf("f", str.length() - 1);
        int g = str.lastIndexOf("g", str.length() - 1);
        int h = str.lastIndexOf("h", str.length() - 1);
        int i = str.lastIndexOf("i", str.length() - 1);
        int j = str.lastIndexOf("j", str.length() - 1);
        int k = str.lastIndexOf("k", str.length() - 1);
        int l = str.lastIndexOf("l", str.length() - 1);
        int m1 = str.lastIndexOf("m", str.length() - 1);
        int n = str.lastIndexOf("n", str.length() - 1);
        int o = str.lastIndexOf("o", str.length() - 1);
        int p = str.lastIndexOf("p", str.length() - 1);
        int q = str.lastIndexOf("q", str.length() - 1);
        int r = str.lastIndexOf("r", str.length() - 1);
        int s = str.lastIndexOf("s", str.length() - 1);
        int t = str.lastIndexOf("t", str.length() - 1);
        int u = str.lastIndexOf("u", str.length() - 1);
        int v = str.lastIndexOf("v", str.length() - 1);
        int w = str.lastIndexOf("w", str.length() - 1);
        int x = str.lastIndexOf("x", str.length() - 1);
        int y = str.lastIndexOf("y", str.length() - 1);
        int z = str.lastIndexOf("z", str.length() - 1);

        
        System.out.println(" a  b c  d  e  f  g  h i  j");
        System.out.println("===========================");
        System.out.println(a1 + " " + b1 + " " + c + " " + d + " " +
                           e + " " + f + " " + g + " " + h + " " +
                           i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m1 + " " + n + " " +
                           o + " " + p + " " + q + " " + r + " " +
                           s + " " + t + "\n");

        System.out.println(" u  v  w  x  y  z");
        System.out.println("=================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                           y + " " + z);

        //8
        String str3 = "topjavatutorial";
        System.out.println(removeDuplicateChars(str3));
        String str2 = "hello";
        System.out.println(removeDuplicateChars(str2));

        
        //11
        boolean[] boolArr = new boolean[] { true, true, false, true }; 
        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' }; 
        double[] dblArr = new double[] { 1, 2, 3, 4 }; 
        int[] intArr = new int[] { 1, 2, 3, 4 }; 
        Object[] objArr = new Object[] { 1, 2, 3, 4 }; 

        System.out.println("Boolean Array: "+ Arrays.toString(boolArr)); 
        System.out.println("Character Array: "+ Arrays.toString(charArr)); 
        System.out.println("Double Array: " + Arrays.toString(dblArr)); 
        System.out.println("Integer Array: "+ Arrays.toString(intArr)); 
        System.out.println("Object Array: "+ Arrays.toString(objArr)); 


        //12
        String string ="    India Is My Country";  
        System.out.println(wordcount(string) + " words."); 

        //13
        int n1=0,n2=1,N3,i2,count=10;    
        System.out.print(n1+" "+n2);  
           
        {    
            for(i2=2;i2<count;++i2)   {
            N3=n1+n2;    
            System.out.print(" "+N3);    
            n1=n2;    
            n2=N3;    
        }    
        }
        System.out.println();   

        //14
        int [] arr5 = new int [] {5, 6, 7, 8, 1, 2, 3, 4};           
        int n11 = 4;    
           
        System.out.println("Original array: ");    
        for (int i3 = 0; i3 < arr5.length; i3++) {     
            System.out.print(arr5[i3] + " ");     
        }        
       
        for(int i3 = 0; i3 < n11; i3++){    
            int j1, last;    
             
            last = arr5[arr5.length-1];    
            
            for(j1 = arr5.length-1; j1 > 0; j1--){    
               
                arr5[j1] = arr5[j1-1];    
            }    
             
            arr5[0] = last;    
        }    
        
        System.out.println();    
            
      
        System.out.println("Array after right rotation: ");    
        for(int i4 = 0; i4< arr5.length; i4++){    
            System.out.print(arr5[i4] + " ");    
        } 
        System.out.println();   

        //16

        int dividend = 22;
		int divisor = -7;

        System.out.println("Quotient is " + divide(dividend, divisor));
        System.out.println();   
        //17
        String str11 = "test";  
        String str22 = "ttew";  
        if (arePermutation(str11, str22))  
        System.out.println("Yes");  
        else
        System.out.println("No"); 
        System.out.println();   

        //19
        String s1 = "ajblqcpdz";  
        String t11 = "aefcnbtdi";  
        
        System.out.println(CommomSubsequencesCount(s1, t11));  
        System.out.println();   

        //20
        int arr1[] = { 3, 3, 2, 3 }; 
        int n3 = arr1.length; 
        System.out.println("The element with single occurrence is " + getSingle(arr1, n3)); 

        //21
        int x1 = 12, y1 = 15, z1 = 5;
        System.out.printf("Minimum of 3" + " numbers is %d", smallest(x1, y1, z1)); 

        //22
        int x2 = 2, y2 = 4;
		System.out.println("min(" + x2 + ", " + y2 + ") is " + findMin(x2, y2));
        System.out.println("max(" + x2 + ", " + y2 + ") is " + findMax(x2, y2));
        
        //23
        int ar[] = {2, 3, 5, 4, 5, 3, 4}; 
        int n4 = ar.length; 
        System.out.println("Element occurring once is " +  findSingle(ar, n4) + " "); 

        //24
        int x3 = 23;       
        System.out.println(swapBits(x2));
        

} 
}
