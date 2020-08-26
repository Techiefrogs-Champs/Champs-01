public class String15 {
    public static void main(String[] args) {
       String s="print";
       String k="system";   

      System.out.println("s= "+s);
      System.out.println("k="+k);
      s=s+k;
      k=s.substring(0,s.length()-k.length());
      s=s.substring(k.length());

     System.out.println("s= "+s);
      System.out.println("k= "+k);


    }   















}