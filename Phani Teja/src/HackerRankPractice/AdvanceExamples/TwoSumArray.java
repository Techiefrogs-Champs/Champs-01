package AdvanceExamples;
public class TwoSumArray {
    static void FindAllPairs(int array[],int sum){
        for(int i=0;i<array.length; i++) {  //to get arrat[i]
            for(int j=i+1;j<array.length; j++) {//to get array[j]
                if(array[i]+array[j]==sum){
                    System.out.println("The Pair Of Numbers required are "+"("+array[i]+" , "+array[j]+")");
                }
                //else{
                   // System.out.println("The Pair Of Numbers required couldn't be found");
                //}
            }
        }
    }
    public static void main(String[] args) {
        //int array[]={1,3,5,7,9,23};//assigning values of arrays
       // int sum=30;//assigning the required value
      //  FindAllPairs(array, sum);
      FindAllPairs(new int[]{1,2,3,10,20}, 30);

    }

    }

