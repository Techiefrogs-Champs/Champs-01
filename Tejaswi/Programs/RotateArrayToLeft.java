package Programs;

import java.util.Arrays;

public class RotateArrayToLeft {
    public static void main(String[] args)
     { 
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
         int k = 4;
          System.out.println("Rotate given array " + Arrays.toString(input) + " by 4 places to the left."); 
          int[] rotatedArray = rotateLeft(input, input.length, k); 
          System.out.println("Rotated array: " + Arrays.toString(rotatedArray)); 
    } 
    private static int[] rotateLeft(int[] input, int length, int numOfRotations) 
    { 
        for (int i = 0; i < numOfRotations; i++) 
         { 
                // take out the first element 
                int temp = input[0]; 
                for (int j = 0; j < length - 1; j++) 
                { 
                    // shift array elements towards left by 1 place 
                    input[j] = input[j + 1]; 
                } input[length - 1] = temp; 
        }
             return input; 
     }       
 }
