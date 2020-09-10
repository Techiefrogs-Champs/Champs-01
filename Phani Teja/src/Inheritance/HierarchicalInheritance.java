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
     class Banana extends Fruits{
        void yellow(){
            System.out.println("Banana is yellow in colour");
        }
    }
    class HierarchicalInheritance{
        public static void main(String[] args){
            Banana b=new Banana();
            b.colour();
            b.yellow();
            
        }

    
    
} 
    
