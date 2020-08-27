class stddetails
{
        private int rno;
        private String sname;
        public void setstud(int no,String name)
        {
                rno = no;
                sname = name;
        }
        public void display()
        {
                System.out.println("Student No : " + rno);
                System.out.println("Student Name : " + sname);
        }
}
class marks extends stddetails
{
        protected int maths,science,social;
        public void setmarks(int m1,int m2,int m3)
        {
                maths = m1;
                science = m2;
                social =m3;
        }
        public void putmarks()
        {
                System.out.println("maths : " + maths);
                System.out.println("science: " + science);
                System.out.println("social:"+social);
        }
}
class Student extends marks
{
        private int total;
        public void calc()
        {
                total = maths + science+social;
        }
        public void puttotal()
        {
                System.out.println("Total : " + total);
        }
        public static void main(String args[])
        {
                Student f = new Student();
                f.setstud(111,"srinivas");
                f.setmarks(78,89,90);
                f.calc();
                f.display();
                f.putmarks();
                f.puttotal();
        }
}
    