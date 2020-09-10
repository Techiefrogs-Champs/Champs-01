class Emp{
    String name,adres;
    int year,salary;
    public Emp(String n,int y,int s,String a){
        name=n;
        year=y;
        salary=s;
        adres=a;
    }
    void display(){
        System.out.println(name+"       "+year+"       "+salary+"      "+adres);
    }

}
public class Practice_10{
    public static void main(String args[]){
    
        Emp e1=new Emp("Robert",1994,20000,"walls dc");
        Emp e2=new Emp("Sam",2000,20500,"walls street");
        Emp e3=new Emp("jhon",1999,30000,"DC walls");
        e1.display();
        e2.display();
        e3.display();
        
    }
    
}