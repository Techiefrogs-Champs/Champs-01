package absracts;

abstract class Animals {
    abstract void cats();
    abstract void dogs();
    
}

class Cats extends Animals{
    
    void dogs(){

    }
    void cats(){
        System.out.println("cats meow");

    }
}
class Dogs extends Animals{
    void dogs(){
        System.out.println("dogs barking");
    }
    void cats(){

    }
}
class abs5{
    public static void main(String []args){
        Animals obj1=new Cats();
        Animals obj2=new Dogs();
        obj1.cats();
        obj2.dogs();
    }
}