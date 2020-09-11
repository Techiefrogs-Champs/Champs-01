//Create three interfaces, each with two methods. Inherit a new interface from the three, adding a new method. 
//Create a class by implementing the new interface and also inheriting from a concrete class.
// Now write four methods, each of which takes one of the four interfaces as an argument. 
//In main( ), create an object of your class and pass it to each of the methods.
package Exam;
interface Exam1
{
    void m1();
    void m2();
}
interface Exam2
{
    void s1();
    void s2();
}
interface Exam3
{
    void t1();
    void t2();
}
interface Student extends Exam1,Exam2,Exam3{
    void newm();
}
class Teacher implements Student{
    public  void m1()
    {
        System.out.println("Method 1");
    }
    public void m2()
    {
        System.out.println("Method 2");
    }
    public void s1()
    {
        System.out.println("Method 3");
    }
    public void s2()
    {
        System.out.println("Method 4");
    }
    public void t1()
    {
        System.out.println("Method 5");
    }
    public void t2()
    {
        System.out.println("Method 6");
    }
    public void newm()
    {
        System.out.println("New Method");
    }
    public static void main(String[] args) {
        Teacher t= new Teacher();
        t.m1();
        t.m2();
        t.s1();
        t.s2();
        t.t1();
        t.t2();
        t.newm();
    }
    
}
