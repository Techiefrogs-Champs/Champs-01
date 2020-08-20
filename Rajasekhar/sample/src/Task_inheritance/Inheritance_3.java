/* Create a class named 'Member' having the following members: Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and
 a manager by making an object of both of these classes and print the same. */

package src.Task_inheritance;

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
class Inheritance_3{
    public static void main(String[] args){
      Employee e = new Employee();
      Manager m = new Manager();
      System.out.println("Name: "+ (e.name = "Rajasekhar"));
      System.out.println("Age: "+(e.age = 27));
      System.out.println("Number: "+(e.number = "988223"));
      System.out.println("Address: "+(e.address = "Hyderabad"));
      System.out.println("Salary: "+(e.salary = 150000));
      System.out.println("Specialization: "+(e.specialization = "developer"));
      System.out.println("Name: "+ (m.name = "Rajasekhar"));
      System.out.println("Age: "+(m.age = 35));
      System.out.println("Number: "+(m.number = "1023101"));
      System.out.println("Address: "+(m.address = "Hyderabad"));
      System.out.println("Salary: "+(m.salary = 2200000));
      System.out.println("Specialization: "+(m.department = "development"));
      e.printSalary();
      m.printSalary(); 
    }
  }