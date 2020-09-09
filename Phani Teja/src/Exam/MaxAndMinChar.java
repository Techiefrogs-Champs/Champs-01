package Exam;

import java.util.Scanner;

public class MaxAndMinChar {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        str=sc.nextLine();
        int frequency[i];
        int i,j,min=0,max=0;
        char string[]=str.toCharArray();
        for(i=0;i<string.length;i++){
            for(j=i+1;j<string.length;j++){
                if(string[i]==string[j])
                frequency[i]++;
            }
        }
    }
}
