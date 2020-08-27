class Example_3
{
   private int stuID;
   private String stuName;
   private int stuAge;
   Example_3()
   {
       stuID = 100;
       stuName = "Srinivas";
       stuAge = 25;
   }
   Example_3(int n, String s, int m)
   {
    
       stuID = n;
       stuName = s;
       stuAge = m;
   }
   //Getter and setter methods
   public int getStuID() {
       return stuID;
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;
   }
   public String getStuName() {
       return stuName;
   }
   public void setStuName(String stuName) {
       this.stuName = stuName;
   }
   public int getStuAge() {
       return stuAge;
   }
   public void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }

   public static void main(String args[])
   {
       
       Example_3 e = new Example_3();
       System.out.println("Student Name is: "+e.getStuName());
       System.out.println("Student Age is: "+e.getStuAge());
       System.out.println("Student ID is: "+e.getStuID());

       Example_3 e2 = new Example_3(555, "Chaitanya", 25);
       System.out.println("Student Name is: "+e2.getStuName());
       System.out.println("Student Age is: "+e2.getStuAge());
       System.out.println("Student ID is: "+e2.getStuID()); 
  }
}