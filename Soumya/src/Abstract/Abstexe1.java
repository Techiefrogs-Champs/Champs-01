package Abstract;

abstract class Parent {
    abstract void message();
}

 class Boy extends Parent {
     void message() {
    System.out.println("This is the first class");
    }
}
 class Girl extends Parent{
     void message(){
        System.out.println("This is the second class");
     }
    }
     class Abstexe1{
        public static void main(String[] args) {
            Parent b=new Boy();
            Parent g=new Girl();
            b.message();
            g.message();
        
    }
}
 
