class Member
{
  String name;
  int age;
  String number;
  String address;
  int salary;
  void printSalary()
{
    System.out.println(salary);
  }
}
class Employee extends Member
{
  String specialization;
}
class Manager extends Member
{
  String department;
}
class Three
{
  public static void main(String args[])
{
    Employee emp = new Employee();
  System.out.println( emp.name = "Teja");
   System.out.println(emp.age = 12);
    System.out.println(emp.number = "12345****");
    System.out.println(emp.address = "afesafgtrfghtg");
   System.out.println (emp.salary = 1234);
 System.out.println(emp.specialization = "B.tech");
   Manager mg = new Manager();
 System.out.println(mg.name = "Teju");
   System.out.println(mg.age = 16);
    System.out.println(mg.number = "12345****");
    System.out.println(mg.address = "afessddafgtrfghtg");
    System.out.println(mg.salary = 1224);
    System.out.println(mg.department= "cse");
  }
}				