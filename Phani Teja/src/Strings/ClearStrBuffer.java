package Strings;

public class ClearStrBuffer {
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer("Phaniteja");
        sb=sb.delete(1, 6);
        System.out.println(sb);
    }
}