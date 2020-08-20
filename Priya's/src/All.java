interface Birds{
void eat();
}
interface Eagle{
void meat();
}
public class All implements Birds, Eagle{
public void eat(){
    System.out.print("BIRDS EAT GRAINS ");
    }
public void meat(){
        System.out.print("AND EAGLE EATS MEAT");
    }

public static void main(String args[]){
    All obj = new All();
obj.eat();
obj.meat();
}
}
