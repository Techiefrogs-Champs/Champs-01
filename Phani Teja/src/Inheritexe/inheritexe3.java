package Inheritexe;

 class Member{
     String name;
     int age;
     int phone;
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
 class Inheritexe3{
     public static void main(String[] args) {
         Member m=new Manager();
         Employee s =new Employee();
         Manager d=new Manager();
         m.name="pni";
         m.age=25;
         m.address="hyd";
         m.salary=8787;
         m.phone=65865;
         s.name="teja";
         s.age=19;
         s.address="blore";
         s.salary=78363;
         s.phone=6289348;
         d.name="manny";
         d.age=27;


     }
 }
    
