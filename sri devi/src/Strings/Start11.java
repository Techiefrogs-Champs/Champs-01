public class Start11 {
    
  public static void main(String[] args) {
      
    String name="krishna";

     int l=name.length();
      String r="";
     for(int i=l-1;i>=0;i--){

        r=r+name.charAt(i);

     
     }

    System.out.println("reverse="+r);
  }







}