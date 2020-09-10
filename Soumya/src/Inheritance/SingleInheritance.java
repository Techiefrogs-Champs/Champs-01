package Inheritance;

 class Fruits {
    void colour(){
        System.out.println("different colours in fruits");
    }
}
    class Apple extends Fruits{
        void red(){
            System.out.println("Apple is red in colour");
        }
    }
    class SingleInheritance{
        public static void main(String[] args){
            Apple a=new Apple();
            a.colour();
            a.red();
            
        }

    
    
}