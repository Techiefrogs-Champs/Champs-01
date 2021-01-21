

public class leadersInArray {
    public static void main(String[] args) {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        findLeadersInAnArray(arr);
    }
    public static void findLeadersInAnArray(int arr[]) {
        System.out.println("Finding leaders in an array : ");
        int rightMax=arr[arr.length-1];
        
        System.out.print(rightMax+" ");
        for (int i = arr.length-2; i>=0; i--) {
            if(arr[i] > rightMax){
                rightMax=arr[i];
                System.out.print(" "+rightMax);
            }
        }
    }
}
