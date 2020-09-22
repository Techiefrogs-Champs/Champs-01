package AdvanceExamples;
import java.util.*;
public class SortTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n=sc.nextInt();
        int A[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the elements: ");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        int t=0;
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(A[i][j]>A[x][y]){
                            t=A[x][y];
                            A[x][y]=A[i][j];
                            A[i][j]=t;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted Matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
