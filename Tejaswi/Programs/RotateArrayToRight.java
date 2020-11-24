package Programs;

import java.util.Arrays;

/**
 * RotateArrayToRight
 */
public class RotateArrayToRight {
    public static void main(String[] args)
     { 
        int[] input = {5, 6, 7, 8, 1, 2, 3, 4 };
         int k = 4;
          System.out.println("Rotate given array " + Arrays.toString(input) + " by 4 places to the left."); 
          int[] rotatedArray = rotateRight(input, input.length, k); 
          System.out.println("Rotated array: " + Arrays.toString(rotatedArray)); 
    } 
    private static int[] rotateRight(int[] input, int length, int numOfRotations) 
    { 
        for (int i = 0; i < numOfRotations; i++) 
        {
             // take out the last element
              int temp = input[length - 1]; 
              for (int j = length - 1; j > 0; j--) 
              { 
                  // shift array elements towards right by one place 
                  input[j] = input[j - 1];
              }
                  input[0] = temp; 
        } 
                return input; 
     }
 }