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

  


    public static void main(String[] arg) {
  
        //1    
        { 
            int arr[] = { 1, 5, 7, -1, 5 }; 
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


} 
}
