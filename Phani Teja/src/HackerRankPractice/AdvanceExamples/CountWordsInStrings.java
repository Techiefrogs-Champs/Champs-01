package AdvanceExamples;
import java.util.Scanner;
public class CountWordsInStrings {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String :");
    String str=sc.nextLine();
    int count=1;
    for(int i=0;i<str.length();i++){
        if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
            count++;
        }
    }
    System.out.println("Number of words in the given String are: "+count);
    sc.close();
    }    
}
