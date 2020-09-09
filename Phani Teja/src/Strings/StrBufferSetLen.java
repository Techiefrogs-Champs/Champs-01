package Strings;

public class StrBufferSetLen {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("HelloWelcomeToJAVA");
        System.out.println("String length ="+sb.length()+","+sb);
        sb.setLength(2);
        System.out.println(sb.toString());
    }
}