public class Test {
    public static void main(String[] args) {
        String s1="ravi";
        String s2="krishna";
        String s3="ravi";
        String s4=new String("ravi");
        System.out.println(s1==s2);
       System.out.println(s2==s1);
       System.out.println(s3==s1); 
    }
    
}