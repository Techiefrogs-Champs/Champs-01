package Strings;

public class Subsets {
    public static void main(String[] args) {
        String s="PUBG ";
        int len=s.length();
        int temp=0;
        String name[]=new String[len*(len+1)/2];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                name[temp]=s.substring(i, j+1);
                temp++;
            }
        }
        System.out.println("subset's of the given string are :");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
}