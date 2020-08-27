package CodesDope;
class Student1{
    String name;
    int roll_no;
    long phoneno;
    String address;
}
class Student2{
    String name;
    int roll_no;
    long phoneno;
    String address;
}
class CodesDope2{
    public  static void  main(String[] args) {
        Student1 s1=new Student1();
        Student2 s2=new Student2();
        s1.name="Sam";
        s2.name="John";
        s1.roll_no=2;
        s2.roll_no=4;
        s1.phoneno=87687;
        s2.phoneno=78397;
        s1.address="banglore";
        s2.address="hydrabad";
        System.out.println("Name is student1:"+s1.name );
        System.out.println("Roll number of student1 :"+s1.roll_no);
        System.out.println("Phone number of student1 :"+s1.phoneno);
        System.out.println("Address of student1 is :"+s1.address);
        System.out.println("Name is student2 :"+s2.name );
        System.out.println("Roll number of student2 :"+s2.roll_no);
        System.out.println("Phone number of student2 :"+s2.phoneno);
        System.out.println("Address of student2 is :"+s2.address);




    }

}