/* Class B extends Class A. Class A has two member variables 'i' and 'j', a constructor and a method show() 
which displays the value of i and j.Class B has a member variable 'k', a constructor.
 Write a method show() in class B which overrides the show() method of class A and displays the value of k.*/

package src.Task_inheritance;

class A{
    int i,j;
    A(){
        i=5;
        j=9;
    }
    void show(){
        System.out.println(" the values of i and j"+i +j);
    }
}
class B extends A{
    int k;
    B(){
        k=10;
    }
    void show(){
        System.out.println(" the value of k="+k);

    }
}
public class Inheritance_8 {
    public static void main(String[] args){
        B b=new B();
        b.show();
    }
    
}