package src.ClassObjects;

public class Employee {

    String name;
    int yearofjoining;
    String address;

    public Employee(String name,int yearofjoining,String address){
        this.name=name;
        this.yearofjoining=yearofjoining;
        this.address=address;
        //System.out.println("Name is:"+name+" "+"yearofjoining:"+yearofjoining+" "+"Address:"+address);

    }
    public String getName(){
        return name;
      }
      public int getyearofjoining(){
        return yearofjoining;
      }

      public String getAddress(){
        return address;
      }
    public static void main(String args[]) {
        Employee obj1=new Employee("Ravi",1991,"Bnglr");
        Employee obj2=new Employee("Teja",1993,"Hyd");
        Employee obj3=new Employee("Gopi",1995,"Delihi");
        System.out.println("Name\tAddress\tYear of joining");
        System.out.println(obj1.getName()+"\t"+obj1.getAddress()+"\t"+obj1.getyearofjoining()); 
        System.out.println(obj2.getName()+"\t"+obj2.getAddress()+"\t"+obj2.getyearofjoining());
        System.out.println(obj3.getName()+"\t"+obj3.getAddress()+"\t"+obj3.getyearofjoining()); 

 
    }
}