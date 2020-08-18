package src.Accesmodifier;

import src.projected1;

class A1 { //Subclass 
    protected void msg(){
        System.out.println("This is Protected Message1");
    }  
}




public class mainfunction extends projected1 {
   
    public final static void main(String[] args) {
        
        Protected obj=new Protected();
        obj.projectedDisplay();
        obj.projectedDisplay2(4, 4);
        System.out.println(obj.addTwoNumbers(11, 22));

        mainfunction obj1=new mainfunction();
        //obj1.msg();
        obj1.projectedDisplay1();

        
    }

    
}