/* Create a class with a method that prints "This is parent class" and its subclass with another method
 that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class */


package src.Task_inheritance;

class Parent{
    void display()
    {
        System.out.println("This is parent class");
    }
    
}
class Inheritance_1 extends Parent{
    void show(){

        System.out.println("This is Child class");
    }
    public static void main(String[] args){
       Parent p=new Parent();
       Inheritance_1 e=new Inheritance_1();
       p.display();
       e.show();
       e.display();
    }

}