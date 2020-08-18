package src;

public class App {
    int i=1,j;
    String name1="ravi",name2;

    // public App(){
    //     System.out.println("ID="+ i +"name is="+name1);
    // }
    public App(int i,String stng){
        j=i;
        name2=stng;
        System.out.println("ID="+ i +"name is="+name2);
    }
    public App(){
        System.out.println("Defacult Constructor");
    }
    
    public static void main(String[] args)  {
        App obj=new App();
        App obj1=new App(2,"teja");
       
    }
}
