package Debug.java;
import java.util.Arrays;
import java.util.*;
public class debug {


        public static void main(String[] args) {

            // int x, i = 1 ;
            // int sum = 0;
            // System.out.println("Enter Number of items :");
            // Scanner s = new Scanner(System.in);
            // x = s.nextInt();
            // while(i <= x)
            // {
            //     sum = sum +i;
            //     i++;
            // }
            // System.out.println("Sum of "+x+" numbers is :"+sum);

            int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};    
            int [] fr = new int [arr.length];  
            int visited = -1;  
            
            for(int i = 0; i < arr.length; i++){  
                int count = 1;  
                for(int j = i+1; j < arr.length; j++){  
                    if(arr[i] == arr[j]){  
                        count++;  
                        fr[j] = visited;  
                    }  
                }  
                if(fr[i] != visited)  
                    fr[i] = count;  
            }  
            
        
            System.out.println("---------------------");  
            System.out.println(" Element | Frequency");  
            System.out.println("---------------------");  
            for(int i = 0; i < fr.length; i++){  
                if(fr[i] != visited)  
                    System.out.println("    " + arr[i] + "    |    " + fr[i]);  
            }  
            System.out.println("---------------------");  
    
        }  
    
}