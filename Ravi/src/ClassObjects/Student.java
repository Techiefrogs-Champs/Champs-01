package src.ClassObjects;

public class Student {
    
  

        int roll_no=2;
        String name="John";
        String Studentname;
        int rollnumber;
        int phonenumber;
        String address;
        
      
        public static void main(String args[]) {
            Student obj=new Student();
            System.out.println(obj.roll_no);
            System.out.println(obj.name);
            Student obj1=new Student();
            obj1.Studentname="Sam";
            obj1.rollnumber=45;
            obj1.phonenumber=123456;
            System.out.println("Name is:"+" "+obj1.Studentname);
            System.out.println("rollnumber is"+" "+obj1.rollnumber);
            System.out.println("phonenumber is"+" "+obj1.phonenumber);
            Student obj2=new Student();
            obj2.Studentname="John";
            obj2.rollnumber=45;
            obj2.phonenumber=123456;
            System.out.println("Name is"+" "+obj2.Studentname);
            System.out.println("rollnumber is"+" "+obj2.rollnumber);
            System.out.println("phonenumber is"+" "+obj2.phonenumber);


           
        }
        
        
    
}