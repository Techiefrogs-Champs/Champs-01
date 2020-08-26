package acc;

class animal {
    protected String name = "RABBIT";
    protected String type = "HERBIVORE";
    
    protected void display(){
        System.out.println("I AM A HERBIVORE ANIMAL");
    }
}
 class rabbit extends animal {
 public static void main(String[] args) {
 rabbit r = new rabbit();
 System.out.println(r.type);
 System.out.println(r.name);
 r.display();   
}

}