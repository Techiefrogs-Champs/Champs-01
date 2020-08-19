class Apple{
    public int no_of_items;
    public Apple(){
        no_of_items=5;
    }
    void show(){
        System.out.println("No of items in Apple is: "+no_of_items);
    }
}
class Banana extends Apple{
    public int no_of_items;
    Banana(int b){
        no_of_items=b;
    }
    void show(){
        System.out.println("No of items in Banana is: "+no_of_items);
    }

}
public class Exercise10 {
    public static void main(String[] args){
        Apple a=new Apple();
        Banana b=new Banana(21);
        a.show();
        b.show();
    }
}