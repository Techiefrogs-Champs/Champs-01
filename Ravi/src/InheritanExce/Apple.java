package src.InheritanExce;


class Apple1{
    int number_of_items;

    Apple1(){
        number_of_items=20;
    }
    void show(){
        System.out.println("Apple is:"+number_of_items);
    }
    
}
class Banana extends Apple1{
    int number_of_items;

    Banana(){
        number_of_items=40;
    }
    void show(){
        System.out.println("Banana is:"+number_of_items);
    }
}
public class Apple {
    public static void main(String[] args) {
      
        Apple1 obj1=new Apple1();
        obj1.show();
        Banana obj=new Banana();
        obj.show();

    }
    
}