

public class minSumX {
    public static void findPairWithMinSum(int arr[],int X) {
        if(arr.length<2) {
            System.out.println("Invalid Input");
            return;
        }
        
        int minimumDiff=Math.abs(arr[0]+arr[1]-X);
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempDiff=Math.abs(arr[i]+arr[j]-X);

                if(tempDiff< minimumDiff)
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumDiff=tempDiff;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to X using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }
    public static void main(String[] args) {
        int arr[] = {-40,-5,1,3,6,7,8,20};
        findPairWithMinSum(arr,-40);
    }
}

