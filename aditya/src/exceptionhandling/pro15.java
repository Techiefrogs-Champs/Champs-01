package exceptionhandling;

public class pro15 {
    public static void main(String args[]){
        int arr[]=new int[7];
    try{
       arr[-4]=6;
    }
    catch(NegativeArraySizeException e){
        System.out.println("negative array");
    }
    System.out.println("exception handled");
    }
}