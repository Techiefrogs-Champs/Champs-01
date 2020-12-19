//Assign and print the roll number, phone number and address of two students 
//having names "Sam" and "John" respectively by creating two objects of class 'Student'.
package ClassesObjects;
class Student2 {
    int roll_no;
    String ph_no;
    String address;
    
}
class Details{
    public static void main(String[] args) {
        Student2 Sam = new Student2();
        Student2 Jhon = new Student2();
        Sam.roll_no = 15;
        Sam.ph_no = "+91 9494949494";
        Sam.address = "Hyderabad";
        Jhon.roll_no = 16;
        Jhon.ph_no = "+91 9494949498";
        Jhon.address = "Bangalore";
    System.out.println("Sam's Roll Number is:"+Sam.roll_no+  ", Phone Number is:"+Sam.ph_no+
    " and Address is:"+Sam.address);
    System.out.println("Jhon's Roll Number is:"+Jhon.roll_no+  ", Phone Number is:"+Jhon.ph_no+
    " and Address is:"+Jhon.address);

    }
}