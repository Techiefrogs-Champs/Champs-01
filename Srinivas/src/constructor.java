 public class constructor {
    String name;
    constructor(){
       this.name = "constructor is working";
    }
    public static void main(String[] args) {
       constructor obj = new constructor();
       System.out.println(obj.name);
    }
 }