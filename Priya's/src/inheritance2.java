interface Printable{
    void print();
    }
    interface Showable extends Printable{
    void show();
    }
    class inheritance2 implements Showable{
        public void print(){
            System.out.println("Hello");
        }
     public void show(){
            System.out.println("Welcome");
        }
    
        
    
    
    public static void main(String args[]){
     inheritance2 obj = new inheritance2();
     obj.print();
     obj.show();
    }
}