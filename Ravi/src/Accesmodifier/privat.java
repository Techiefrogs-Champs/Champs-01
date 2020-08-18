package src.Accesmodifier;

class Data {

    public String name="ravi"; // private

    // private String name1;

    public Data(){
        System.out.println("private constructor");
    }

    private int square(int a){
        return a*a;
    }
    private void display() 
    { 
        System.out.println("This is private method"); 
    } 
   
}

class Data1 {
    public int j;
    public String name2;

    public Data1(int i, String stng){  // private
       this.j = i;
       this.name2 = stng;
       System.out.println("ID=" + i + "name is=" + name2);
    }
}

 class Data2{  
     
    public int Data2=40;  // private

    public void msg(){
        System.out.println("Hello Ravi");
    }  

} 

public class privat {
    
    public static void main(String[] main){

        Data obj1 = new Data();
        // obj1.name1="Ravi";
        //System.out.println(obj.square(10));
        // obj1.display();

        System.out.println(obj1.name);
 
        Data1 obj2=new Data1(2,"TEJA");
        
        Data2 obj3=new Data2();
        System.out.println(obj3.Data2);
        obj3.msg();
    }
    
}