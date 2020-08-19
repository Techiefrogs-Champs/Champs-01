interface Animals{
    void eat();
}

class Rabbit implements Animals{
    public void eat(){
        System.out.println("RABBITS EAT GRASS AND CARROTS");
        
    }
}

    class Tiger implements Animals{
        public void eat() {
            System.out.println("TIGERS EAT RABBITS AND MEAT");
        }
    }

    class Interface{
         public static void main(String[] args) {
            Animals A = new Tiger();
            A.eat();
        }
    }
