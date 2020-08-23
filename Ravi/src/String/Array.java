package src.String;
import java.util.Arrays;
public class Array {

    public static void main(String[] args) {      
          
    //1
        int [] arr1 = new int [] {1, 2, 3, 4, 5};           
        int arr2[] = new int[arr1.length];  
      
        for (int i = 0; i < arr1.length; i++) {   
            arr2[i] = arr1[i];   
        }    
          
       
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr1.length; i++) {   
           System.out.print(arr1[i] + " ");  
        }   
          
        System.out.println();  
          
       
        System.out.println("Elements of new array: ");  
        for (int i = 0; i < arr2.length; i++) {   
           System.out.print(arr2[i] + " ");  
        }  
    
    //2   
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


    //3
        int [] ar = new int [] {1, 2, 3, 4, 5};   
      
        int n = 3;  
              
        System.out.println("Original array: ");  
        for (int i = 0; i < ar.length; i++) {   
            System.out.print(ar[i] + " ");   
        }    
                
        for(int i = 0; i < n; i++){  
            int j, first;  
             
            first = ar[0];  
          
            for(j = 0; j < ar.length-1; j++){  
               
                ar[j] = ar[j+1];  
            }  

            ar[j] = first;  
        }  
          
        System.out.println();  
          
 
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< ar.length; i++){  
            System.out.print(ar[i] + " ");  
        }  

        System.out.println();  
    
    //4
        int [] ar1 = new int [] {1, 4, 2, 7, 8, 8, 3, 7, 3, 6, 2};  
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < ar1.length; i++) {  
            for(int j = i + 1; j < ar1.length; j++) {  
                if(ar1[i] == ar1[j])  
                    System.out.println(ar1[j]);  
                }  
        }  
        System.out.println();  
    
    //5
        int [] ar2 = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");   
        for (int i = 0; i < ar2.length; i++) {  
            System.out.print(ar2[i] + " ");  
        }   
        System.out.println();   
    //6 
        for (int i = ar2.length-1; i>=0; i--) {  
            System.out.print(ar2[i] + " ");  
        }  
         System.out.println();  
        
        
    //7 
         int [] ar3 = new int [] {1, 2, 3, 4, 5};  
  
        System.out.println("Elements of given array present on even position: ");  
        for (int i = 1; i < ar3.length; i = i+2) {  
            System.out.println(ar3[i]);  
        } 
        System.out.println();   
    //8    
        for (int i = 0; i < ar3.length; i = i+2) {  
            System.out.println(ar3[i]);  
        } 

    //9
        int [] arr4 = new int [] {25, 11, 7, 75, 56};  
        int max = arr4[0]; 
        int min = arr4[0];   
        int sum = 0;  
       
        for (int i = 0; i < arr4.length; i++) {  
            if(arr4[i] > max)  
               max = arr4[i];  
        }  
        System.out.println("Largest element present in given array: " + max); 

        for (int i = 0; i < arr4.length; i++) {  
            if(arr4[i] < max)  
               max = arr4[i];  
        }  
    //10
        System.out.println("Smallest element present in given array: " + max);  
    //11
        System.out.println("Number of elements present in given array: " + arr4.length);  
     
    //12
        for (int i = 0; i < arr4.length; i++) {  
            sum = sum + arr4[i];  
         }  
         System.out.println("Sum of all the elements of an array: " + sum);   



    //13
         int [] arr5 = new int [] {1, 2, 3, 4, 5};           
         int n1 = 3;    
            
         System.out.println("Original array: ");    
         for (int i = 0; i < arr5.length; i++) {     
             System.out.print(arr5[i] + " ");     
         }        
        
         for(int i = 0; i < n1; i++){    
             int j, last;    
              
             last = arr5[arr5.length-1];    
             
             for(j = arr5.length-1; j > 0; j--){    
                
                 arr5[j] = arr5[j-1];    
             }    
              
             arr5[0] = last;    
         }    
         
         System.out.println();    
             
       
         System.out.println("Array after right rotation: ");    
         for(int i = 0; i< arr5.length; i++){    
             System.out.print(arr5[i] + " ");    
         } 
         
    //14     
        int [] arr6 = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
          
        for (int i = 0; i < arr6.length; i++) {     
            for (int j = i+1; j < arr6.length; j++) {     
               if(arr6[i] > arr6[j]) {    
                   temp = arr6[i];    
                   arr6[i] = arr6[j];    
                   arr6[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
      
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr6.length; i++) {     
            System.out.print(arr6[i] + " ");    
        }    

    //15
        for (int i = 0; i < arr6.length; i++) {     
            for (int j = i+1; j < arr6.length; j++) {     
               if(arr6[i] < arr6[j]) {    
                   temp = arr6[i];    
                   arr6[i] = arr6[j];    
                   arr6[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
      
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr6.length; i++) {     
            System.out.print(arr6[i] + " ");    
        }  
        System.out.println();    


        // 16----20
        int temp1, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;
   
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp1 = array[i];
                    array[i] = array[j];
                    array[j] = temp1;
                }
            }
        }
        System.out.println("Third largest number is:: "+array[size-3]);
        System.out.println("second largest number is:: "+array[size-2]);
        System.out.println("Large largest number is:: "+array[size-1]);
        System.out.println("2nd Smallest element of the array is:: "+array[0]);
        System.out.println("Smallest element of the array is:: "+array[0]);

    //22 /24
        int[] myArray = {23, 93, 56, 92, 39};
            System.out.println("Even numbers in the given array are:: ");

            for (int i=0; i<myArray.length; i++){
                if(myArray[i]%2 == 0){
                    System.out.println(myArray[i]);
                }
            }
            System.out.println("Odd numbers in the given array are:: ");

            for (int i=0; i<myArray.length; i++){
                if(myArray[i]%2 != 0){
                    System.out.println(myArray[i]);
                }
            }
        
        //23    
            String[] myArra = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
            int siz = myArra.length;
      
            for(int i = 0; i<siz-1; i++) {
               for (int j = i+1; j<myArra.length; j++) {
                  if(myArra[i].compareTo(myArra[j])>0) {
                     String temp2 = myArra[i];
                     myArra[i] = myArra[j];
                     myArra[j] = temp2;
                  }
               }
            }
            System.out.println(myArra.toString());

    //25
    int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };

        display(matrix);

        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }   

    //26   
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
        int c[][] = new int[3][3]; // 3 rows and 3 columns

        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
              c[i][j] = a[i][j] - b[i][j];
              System.out.print(c[i][j] + " ");
           }
           System.out.println();
        }  

    //38
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average1 = sum / numArray.length;
        System.out.format("The average is: %.2f", average1);

    //39
        int[] ravi={1,4,66,22};
        int max = ravi[0]; 
        for(int i=0; i<ravi.length;i++){
            if(ravi[i]>max)
            max=ravi[i];
        }
        System.out.println("Largest in given array is " + max); 
      
    //45
        int arr[]=new int[4];  

        arr[0]=10;  
        arr[1]=20;    
        arr[2]=70;    
        arr[3]=40;    

        for(int i=0;i<arr.length;i++)     
        System.out.println(arr[i]);     
        
    //46
    
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int a1 = array1.length;
        int b1 = array2.length;
        int[] result = new int[a1 + b1];

        System.arraycopy(array1, 0, result, 0, a1);
        System.arraycopy(array2, 0, result, a1, b1);

        System.out.println(Arrays.toString(result));

    //47
        char ch = 'R';
        String st = Character.toString(ch);
        System.out.println("The string is: " + st);

    //48
    
        int[] myArray = {55, 45, 69, 44};
        int num = 5;
        boolean found = false;

        for (int n : myArray) {
            if (n == num) {
                found = true;
                break;
            }
        }
        if(found)
        System.out.println(num + " is found.");
        else
        System.out.println(num + " is not found.");


      for(int i = 0; i<myArray.length; i++){
         if(num == myArray[i]){
            System.out.println("Array contains the given element is Found");
         }

      }
        


     
    } 
    
}