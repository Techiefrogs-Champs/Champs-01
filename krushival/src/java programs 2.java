import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
class forloop {
    public static void main(String [] args) {
        int c;
        for (c = 1; c <= 10; c++) {
            System.out.println(c);
        }
    }
}

  class Notepad {
      public static void main(String[] args) {
          Runtime rs = Runtime.getRuntime();
          try {
              rs.exec("notepad");
          }
          catch (IOException e) {
            System.out.println(e);
          }
        }
    }
        


        
            