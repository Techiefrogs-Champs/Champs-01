package Strings;

public class AllPermutation {
    public static String swapString(String a,int i,int j){
        char[] b=a.toCharArray();
        char ch;
        ch=b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);
    }
    public static void main(String[] args) {
        String s="APT";
        int len=s.length();
        System.out.println("LL permutations of a string are :");
        generatePermutation(str,0,len);
    }
    public static void generatePermutation(String s,int start,int end) {
        if(start==end-1){
        System.out.println(s);
        }
        else{
            for(int i=start;i<end;i++){
                s=swapString(s,start,i);
                generatePermutation(s, start+1, end);
                s=swapString(s, start, i);
            }
        }
    }
}