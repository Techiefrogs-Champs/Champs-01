class Student{
    String name;
    int rollno;
    int age;
    String address;
    
   void info(){
     System.out.println("Name: "+name);
     System.out.println("Roll Number: "+rollno);
     System.out.println("Age: "+age);
     System.out.println("Address: "+ address);

   }

}
   class class2{

  public static void main(String args[]) {
    Student obj  = new Student();
    obj.info();
    
      
  }
      
}

