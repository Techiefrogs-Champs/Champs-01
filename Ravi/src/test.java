package src;

public class test {

    public int i=10;
    public String name="ravi";

    public void M1() {
        int a=100;
        int b=200;
        System.out.println(a);
        System.out.println(b);  
    }

    public void M2() {
        System.out.println("ID="+ i +"name is="+name);
    }
    
}

 class Protected1 {
    protected  void projectedDisplay(){
        System.out.println("protected access modifier is accessible within package and outside the package but through inheritance only");
    }
  
}