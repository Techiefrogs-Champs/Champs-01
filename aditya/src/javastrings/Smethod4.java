package javastrings;

public class Smethod4 {
    public static void main(String []args){
    String str1="HELLO";
    String str2="hello";
    String str3="hello";
    int var1= str1.compareToIgnoreCase(str2);
    int var2=str2.compareTo(str1);
    System.out.println(var1);
    System.out.println(var2); 
}
}