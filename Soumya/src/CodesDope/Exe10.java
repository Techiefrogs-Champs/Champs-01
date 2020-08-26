package CodesDope;

class Emp
{
    String name,add;
    int year,salary;
}
public class Exe10 {
    public static void main(String[] args){
        Emp e1=new Emp();
        Emp e2=new Emp();
        Emp e3=new Emp();
        e1.name="Robert";
        e2.name="Sam";
        e3.name="john";
        e1.year=1994;
        e2.year=2000;
        e3.year=1999;
        e1.add="Banglore";
        e2.add="Banglore";
        e3.add="Banglore";
        System.out.println("Name\tyear\tadd");
        System.out.println(e1.name +"\t" +e1.year+"\t"+e1.add);
        System.out.println(e2.name +"\t" +e2.year+"\t"+e2.add);
        System.out.println(e3.name +"\t" +e3.year+"\t"+e3.add);

    }
}
