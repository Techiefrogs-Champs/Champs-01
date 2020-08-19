package absracts ;

abstract class Parent {
    abstract void message();
}
class child1 extends Parent{
    void message(){
        System.out.println("this is first subclass");
    }
}
class child2 extends Parent{
    void message(){
        System.out.println("this is second subclass");
    }
}
class abs1{
    public static void main(String []args){
        Parent obj=new child1();
        obj.message();
        Parent obj1=new child2();
        obj1.message();

    }
}

