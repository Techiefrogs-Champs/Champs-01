/* Consider a class Apple which is extended by class Banana. Class Apple contains a single integer member 
'number_of_items'.Class Banana contains an integer member 'number_of_items', a constructor and 
a member method show() which displays the values of member variable 'number_of_items' of 
class Apple and class Banana respectively .Display them using the show() method */

package src.Task_inheritance;

class Apple{
    public int no_of_items;
    Apple(int a){
        no_of_items=a;
    }
    void show(){
        System.out.println("No of items in Apple is: "+no_of_items);
    }
}
class Banana extends Apple{
    public int no_of_items;
    Banana(int a,int b){
        super( a);
        no_of_items=b;
    }
    void show(){
        System.out.println("No of items in Banana is: "+no_of_items);
    }
    public static void main(String[] args) {
        Apple obj1 = new Apple(88);
        obj1.show();
        Banana obj = new Banana(99,20);
        obj.show();
    }
}
/* public class Inheritance_10 {
    public static void main(String[] args){
        Apple a=new Apple();
        Banana b=new Banana(21);
        a.show();
        b.show();
    }
} */