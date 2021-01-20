package Arrays;

import java.util.Arrays;

public class duplicateArray {
    public static void main(String[] args) {
        int arr [] = {-3,3,1,2,-3,2,2,3,3,-10,1};
        Arrays.sort(arr);
        int n = arr.length;
        n= removeDupEle(arr,n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }

    public static int removeDupEle(int arr[], int n){
        if(n==0 || n==1){
            return n;
        }

        int [] temp =new int[n];
        int j=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for(int i=0; i<j; i++){
            arr[i]=temp[i];
        }
        return j;
    }
}
