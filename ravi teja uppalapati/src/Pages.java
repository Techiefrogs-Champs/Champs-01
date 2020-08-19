 class Book{
    void write(){System.out.println("write the pages");}
 }
   public class Pages extends Book{
        void read(){System.out.println("read the pages");}
    public static void main(String[] args) {
        Pages obj=new Pages();
        obj.write();
        obj.read();
        
    }
    }
