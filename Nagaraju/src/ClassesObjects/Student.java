//Create a class named 'Student' with String variable 'name' 
//and integer variable 'roll_no'. Assign the value of roll_no as '2' 
//and that of name as "John" by creating an object of the class Student.
package ClassesObjects;
class Student {
String name;
int roll_no;   
}
class Ans {
public static void main(String[] args) {
    Student x = new Student();
    x.name= "Jhon";
    x.roll_no=2;
System.out.println("Number is:"+x.roll_no+  " and Name is:"+x.name);
}
}