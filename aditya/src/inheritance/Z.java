/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/
package inheritance;

    class Member {
     int age;
     String name;
     long PhoneNumber;
     String address;
     short salary;
     void printSalary(int salary ){
         System.out.println("salary of the members is =" +salary);
         
     }
  } 
     class Employee extends Member{
           String specialization;
        Employee(int age,String name,long phoneNumber,int salary,String address){
            System.out.println("the  Employee age is=" +age );
            System.out.println("the Employee name is="  +name);
            System.out.println("the Employee num is ="  +phoneNumber );
            System.out.println("the Employee salary is ="  +salary );
            System.out.println("the employee Address is ="  +address);
           

        }
    }

    class Manager extends Member{
        String  Department;
        Manager(int age,String name,long phoneNumber,int salary,String address){
            System.out.println("the  Manager age is=" +age );
            System.out.println("the Manager name is="  +name);
            System.out.println("the Manager num is ="  +phoneNumber );
            System.out.println("the Manager salary is ="  +salary );
            System.out.println("the Manager Address is ="  +address);
           
        }
    } 
     class Z{
          public static void main(String []args){
          Member obj=new Member();
          obj.printSalary(50000);
          
          Employee obj1=new Employee(23,"aditya",9491954503L,20000,"chintalapudi");
          
          Manager obj2=new Manager(26,"akhil",7901236183L,30000,"guntur");
          
        }
      }
        
    
