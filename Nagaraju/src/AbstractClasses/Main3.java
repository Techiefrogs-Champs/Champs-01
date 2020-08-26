

//We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
//by student A and in four subjects (each out of 100) by student B. 
//Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
//It is inherited by two other classes 'A' and 'B' each having a method 
//with the same name which returns the percentage of the students. 
//The constructor of student A takes the marks in three subjects as its parameters 
//and the marks in four subjects as its parameters for student B. 
//Create an object for eac of the two classes and print the percentage of marks for both the students.

abstract class Mark
{
 abstract double getPercentage();
}
class A extends Mark
{
 double result;
 A( int a, int b, int c)
 {
  result=(a+b+c)/3;
 }
 double getPercentage()
 {
  return result;
 }
}
class B extends Mark
{
 double result;
 B(int a, int b, int c, int d)
 {
  result=(a+b+c+d)/4;
 }
 double getPercentage()
 {
  return result;
 }
}
class Main3
{
 public static void main(String args[])
 {
  Mark obj_1=new A(10,20,30);
  System.out.println(obj_1.getPercentage());
  Mark obj_2=new B(10,20,38,46);
  System.out.println(obj_2.getPercentage());
 }
}