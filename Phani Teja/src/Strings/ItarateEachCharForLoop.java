package Strings;

public class ItarateEachCharForLoop {
    public static void main(String[] args) {
        String s="Techie";
        System.out.println("Characters of "+ s + " using for loop are :");
        for(int i=0;i<s.length();i++){
            char name=s.charAt(i);
            System.out.print(name+" ,");
        }
    }
}