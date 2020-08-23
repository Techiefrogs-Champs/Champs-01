public class first {
    int i;
    String j;
  
    public first(int year, String name) {
      i = year;
      j = name;
    }
  
    public static void main(String[] args) {
      
      first obj = new first(10005, "ram");
      System.out.println(obj.i + " " + obj.j);
     
    }
  }
  