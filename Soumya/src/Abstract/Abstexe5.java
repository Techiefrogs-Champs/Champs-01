package Abstract;

abstract class Animals {
 abstract void cats();
 abstract void dogs();
}
class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
        // TODO Auto-generated method stub

    }
}
class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark");
    }

    @Override
    void cats() {
        // TODO Auto-generated method stub

    }
}
class Abstexe5{
    public static void main(String[] args) {
        Animals c=new Cats();
        Animals d=new Dogs();
        c.cats();
        d.dogs();
    }
}