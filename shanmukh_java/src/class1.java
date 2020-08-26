class Student{
    String name;
    int roll_no;
  }	
 class class1 {
    public static void main(String[] args){
        Student obj = new Student();
        obj.name = "John";
        obj.roll_no = 2;
        System.out.println("Name is "+obj.name+" and roll number is "+obj.roll_no);
      }
}