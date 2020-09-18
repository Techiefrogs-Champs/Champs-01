
import java.util.Scanner;
public class Collec1 {
   public static void main(String[] args) {
     int n;
     System.out.println("please enter the value of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
     int i;   
        int k []=new int [n];
        
        for( i=0;i<n;i++){
            k[i]=sc.nextInt();
        }
        int j=i-1;
         i=0;
        while(i<j){
            int temp=k[i];
            k[i]=k[j];
            k[j]=temp;
            i++;
            j--;
        }
      System.out.println("reverse of an array:");
      for( i=0;i<n;i++){
        System.out.println(k[i]);
      }
   } 
}
