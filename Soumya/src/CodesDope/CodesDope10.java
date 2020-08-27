package CodesDope;

 class Employee {
    String name;
    int y_of_j;
    int salary;
    String address;
}
class CodesDope10{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.name="Robert";
        e2.name="Sam";
        e3.name="john";
        e1.y_of_j=1994;
        e2.y_of_j=2000;
        e3.y_of_j=1999;
        e1.address="64C-WallsStreet";
        e2.address="68D-WallsStreet";
        e3.address="26B-WallsStreet";
        System.out.println(" Name:"+e1.name+e2.name+e3.name);
        System.out.println("Year of joining :"+e1.y_of_j +e2.y_of_j +e3.y_of_j);
        System.out.println("Address :"+e1.address +e2.address +e3.address);

    }
}