class diffanimal{
    void eat(){
        System.out.println("FOOD CHAIN");
    }
}
class hare extends diffanimal{
    void carrot(){
        System.out.println("HARE EATS CARROTS");
    }
}
class food extends hare{
    void food(){
        System.out.println("CARROTS GROW IN GROUND");
    }
}
class inheritance{
    public static void main(String[] args) {
        food l = new food();
        l.eat();
        l.carrot();
        l.food();
    }
}


