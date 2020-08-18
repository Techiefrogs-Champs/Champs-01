package src.InheritanExce;





class Member1{
    String name;
    int age;
    int number;
    String address;
    int salary;
  
    public void printSalary(){
      System.out.println(salary);
    }
  
  }
  
  class Employee extends Member1{
    String specialization;
  }
  
  class Manager extends Member1{
    String department;
  }
  
  public class Member {
    public static void main(String[] args){
      Employee e = new Employee();
      e.name = "Ravi";
      e.age = 23;
      e.number = 12345678;
      e.address = "Hyd";
      e.salary = 1231;
      e.specialization = "ABCDE";
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.number);
        System.out.println(e.salary);
        System.out.println(e.specialization);
      Manager m = new Manager();
      m.department="Angular";
      System.out.println(m.department);
     
    }
  }	