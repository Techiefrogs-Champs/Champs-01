    package SortingAlgorithms;
    import java.util.Scanner;
    public class InsertionSoet {
        public static void main(String[] args) 
        {
            int i,j,key,n;
            Scanner s=new Scanner(System.in);
            System.out.println("enter the number of elements");
            n=s.nextInt();
            int a[]=new int [n];
            System.out.println("enter the elements");
            for(i=0;i<n;i++)
            {
            a[i]=s.nextInt();
            }
            for(i=0;i<n;i++)
            {
            key=a[i];
            for(j=i-1;j>=0;j--)
            {
                if(key<a[j])
                {
                     a[j+1]=a[j];
                 }
                else
                break;
            }
            a[j+1]=key;
        }
         System.out.println("after sorting elements are");
         for(i=0;i<n;i++)
          {
                System.out.print(a[i]+" ");
          }
        }
    }
