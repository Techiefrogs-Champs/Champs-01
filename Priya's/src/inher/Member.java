package inher;

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
  
  class Details{
    public static void main(String[] args){
      Employee e = new Employee();
      System.out.println(e.name = "PRIYA"); 
      System.out.println(e.age = 21);
     System.out.println( e.number = "986****");
      System.out.println(e.address = "ABC STREET");
      System.out.println(e.salary = 45642);
      System.out.println(e.specialization = "XYZ DEVELOPER");
  
      Manager m = new Manager();
      System.out.println(m.name = "KRISHNA");
      System.out.println(m.age = 32);
      System.out.println( m.number = "986****");
      System.out.println(m.address = "PQR STREET");
      System.out.println(m.salary = 56422);
      System.out.println(m.department = "QRST DEPARTMENT");
  
      
    }
  }							