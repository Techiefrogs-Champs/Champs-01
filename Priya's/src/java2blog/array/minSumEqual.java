package java2blog.array;

public class minSumEqual {
    public static void findPairsWithSumEqualsToX(int arr[], int X) {
        if (arr.length < 2)
            return;
     
        System.out.println("The pair whose sum is equal to: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];
     
                if (tempSum == X) {
                    System.out.println(arr[i] + " " + arr[j]);          
                }
            }            
        }  
    }
    public static void main(String[] args) {
        int arr[] = {-40,-5,1,3,6,7,8,20};
        findPairsWithSumEqualsToX(arr,18);
    }
}

