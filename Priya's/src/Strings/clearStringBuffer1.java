package Strings;

class clearStringBuffer1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Java");
        str.append(" is");
        str.append(" popular.");
        System.out.println("StringBuffer: " + str);
        str.delete(0, str.length());
        System.out.println("Updated StringBuffer: " + str);
      }
    
}