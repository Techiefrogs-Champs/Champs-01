 
class Kiran{
    String name,address;
    int i,no;

    Kiran(int i,int no,String name,String address){
         this.i=i;
         this.no=no;
         this.name=name;
         this.address=address;

}
}
class Ravi{ 
    String name,address;
    int i,no;
    Ravi(){
}}
   
public class Students {
    String name,address;
    int i,no;
   

    
    public static void main(String[] args){
    Kiran obj=new Kiran(1,42653,"ravi","ffah");
    System.out.println(obj.i);
    System.out.println(obj.name);
    System.out.println(obj.no);
    System.out.println(obj.address);
    Ravi obj1=new Ravi();
    obj1.i=4;
    obj1.name="kmsv";
    obj1.no=44;
    obj1.address="jknsdhdb";
    System.out.println(obj1.i);
    System.out.println(obj1.name);
    System.out.println(obj1.no);
    System.out.println(obj1.address);
    
    }
}

