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
    class Taste extends Apple{
        void sweet(){
            System.out.println("Apple is sweet in taste ");
        }
    }
    class MultilevelInheritance{
        public static void main(String[] args){
            Taste t=new Taste();
            t.colour();
            t.red();
            t.sweet();
            
        }

    
    
}