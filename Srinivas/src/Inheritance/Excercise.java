package Inheritance;
class Parent{
    void display()
    {
        System.out.println("This is parent class");
    }
    
}
class Excercise extends Parent{
    void show(){

        System.out.println("This is Child class");
    }
    public static void main(String[] args){
       Parent p=new Parent();
       Excercise e=new Excercise();
       p.display();
       e.show();
       e.display();
    }

}