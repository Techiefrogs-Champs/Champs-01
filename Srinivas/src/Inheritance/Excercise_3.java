package Inheritance;

class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;
  
    public void printSalary(){
      System.out.println(salary);
    }
  
  }
  
class Employee extends Member{
    String specialization;
  }
class Manager extends Member{
    String department;
  }
class Excercise_3{
    public static void main(String[] args){
      Employee e = new Employee();
      Manager m = new Manager();
      e.name = "Srinivas";
      e.age = 27;
      e.number = "988223";
      e.address = "Hyderabad";
      e.salary = 150000;
      e.specialization = "manager";
      m.salary=12000;
  
      
     
      e.printSalary();
      m.printSalary();
      
     
    }
  }									
