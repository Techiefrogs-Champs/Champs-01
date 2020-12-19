package Doc1;

public class Sort1 {
    public static void main(String[] args) {
        Integer [] arr = {1789, 2035, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456};
            int temp = 0;    
            
            //Displaying elements of original array    
            System.out.println("Elements of original array: ");    
            for (int i = 0; i < arr.length; i++) {     
                System.out.print(arr[i] + " ");    
            }    
                
            //Sort the array in ascending order    
            for (int i = 0; i < arr.length; i++) {     
                for (int j = i+1; j < arr.length; j++) {     
                   if(arr[i] > arr[j]) {    
                       temp = arr[i];    
                       arr[i] = arr[j];    
                       arr[j] = temp;    
                   }     
                }     
            }    
            System.out.println();    
                
            //Displaying elements of array after sorting    
            System.out.println("Elements of array sorted in ascending order: ");    
            for (int i = 0; i < arr.length; i++) {     
                System.out.print(arr[i] + " ");
            
            }    

        }
    }
    

