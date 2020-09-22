package HackerRankPractice.AdvanceExamples;

//package AdvanceExamples;

public class ArraysToStrings {
    public static void main(String[] args) {
        
    String array[]={"My"," Name"," is"," Phani"," Teja"};
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<array.length;i++){
        sb.append(array[i]);
    }
    String s=sb.toString();
    System.out.println(s);
}
}

