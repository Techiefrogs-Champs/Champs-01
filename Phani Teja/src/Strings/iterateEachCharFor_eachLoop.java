package Strings;

public class iterateEachCharFor_eachLoop {
    public static void main(String[] args) {
        String s="phani";
        System.out.println("Characters of "+s+" using for each loop are :");
        for(char ch: s.toCharArray()){
            System.out.print(ch+ " ,");
        }
    }
}