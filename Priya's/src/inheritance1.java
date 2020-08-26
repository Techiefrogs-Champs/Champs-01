class ANIMALS{
    void types(){
        System.out.println("DIFFERENT TYPES OF ANIMALS");
    }
}
class herbivore extends ANIMALS{
    void eat(){
        System.out.println("HERBIVORE EATS GRASS AND GRAINS");
    }
}
class carnivore extends ANIMALS{
    void meat(){
        System.out.println("CARNIVORE EATS MEAT");
    }
}
class omnivore extends ANIMALS{
    void meals(){
        System.out.println("OMNIVORE EATS BOTH MEAT AND GRASS");
    }
}

class inheritance1{
    public static void main(String[] args) {
    
        omnivore m = new omnivore();
         m.types();
         m.meals();
        }
}