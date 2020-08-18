package src.Accesmodifier;

 //import src.test;

class Default2 {

    public final static void main(String[] args) {
        Default t = new Default();
        t.M1();
        t.addTwoNumbers(1, 3);
        A obj = new A(); //Compile Time Error  
        obj.msg(); //Compile Time Error  
    
        //test t2 =new test();
        // t2.M2();
       
    }
}