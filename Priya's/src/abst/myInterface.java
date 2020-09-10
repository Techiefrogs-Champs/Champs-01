package abst;

import interf.*;

class myInterface implements Interface{
    public void dispaly() {
        System.out.println("HELLO!!!");

    }


    public static void main(String[] args) {

        Interface M = new myInterface();

        M.dispaly();
        System.out.println("the value in interface is: "+a);
        
    }

}