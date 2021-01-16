package Arrays;

public class consecutiveElements {
    static Boolean areConsecutives(int arr[], int n){
        int first_term = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++){
            if(arr[j] < first_term)
            first_term = arr[j];
        }
 
        int ap_sum = (n * (2 * first_term + (n - 1)*1)) / 2;
        int arr_sum = 0;
        for (int i = 0; i < n; i++)
            arr_sum += arr[i];
        return ap_sum == arr_sum;
    }
    public static void main(String[] args){
    int arr[] = { 2, 1, 0, -3, -1, -2 };
    int n = arr.length;
    Boolean result = areConsecutives(arr, n);
    if(result == true)
    System.out.println("Yes");
    else
    System.out.println("No");
 
    }
}
