/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' 
and that of name as "John" by creating an object of the class Student */
class Studen
{
    String name="jhon";
    int roll_no=2;
}
public class Practice_1{
    public static void main(String[] args) 
    {
        Studen s = new Studen();
      
        System.out.println("Name is " + s.name +" \nroll number is " + s.roll_no);
    }
}