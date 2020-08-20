package inheritance;

class data{ 

String name;
int age;
int phnnum;
String address;
int salary;
  public void printSalary(){ 

System.out.println("salary of members");
   }

}

class Employee extends data{

String specialization; 

}
class Manager extends data{ 
   
    String department;

}     
    
public class Member { 

    public static void main(String[] args) {
         Manager obj=new Manager();
          Employee obj1=new Employee();
          data obj2=new data();

        obj1.address="rjy";
        obj1.name="gopal";
        obj1.age=23;
        obj1.phnnum=12345;
        obj1.salary=45000;
        obj1.specialization="xyz";

        System.out.println("name"+obj1.name);



    }
    
}