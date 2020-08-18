package src.InterfaceExce;

public class TWO {


        protected class Two implements ONE
        {
           public void one() {
            System.out.println("Inner class of ONE");
           }
           protected Two() {
            System.out.println("Outer class of Two");
           }
        }
} 
    
