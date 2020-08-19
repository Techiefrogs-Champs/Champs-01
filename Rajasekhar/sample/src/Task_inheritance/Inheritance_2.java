/* In the above example, declare the method of the parent class as private and then repeat 
the first two operations (You will get error in the third). */

package src.Task_inheritance;

class Parent1{
    private void display()
    {
        System.out.println("This is parent class");
    }
    
}
class Inheritance_2 extends Parent{
    void show(){

        System.out.println("This is Child class");
    }
    public static void main(String[] args){
      // Parent1 p=new Parent1();
       Inheritance_2 e=new Inheritance_2();
       // p.display();
       e.show();
       e.display();
      
    }

}

