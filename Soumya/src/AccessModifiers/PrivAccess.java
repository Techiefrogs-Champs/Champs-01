package AccessModifiers;

class Square {
    
    int square(int a) {
        return a * a;

    }
}

public class PrivAccess {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s.square(5));
    }
}