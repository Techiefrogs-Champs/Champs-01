
class Parent1{
    void display()
    {
        System.out.println("This is parent class");
    }
    
}
class Exercise1 extends Parent1{
    void show(){

        System.out.println("This is Child class");
    }
    public static void main(String[] args){
       Parent1 p=new Parent1();
       Exercise1 e=new Exercise1();
       p.display();
       e.show();
       e.display();
    }

}