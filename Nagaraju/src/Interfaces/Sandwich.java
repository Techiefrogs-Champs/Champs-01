/* Q-5).In c07:Sandwich.java, create an interface called FastFood (with appropriate methods) 
and change Sandwich so that it also implements FastFood. */


package src.Task_Interfaces;

interface FastFood{
    void noodles();
    void fried_rice();
    void french_fries();
}

public class Sandwich implements FastFood {
    public void noodles(){
        System.out.println("\nnoodles is chinees based food ");
    }
    public void fried_rice(){
        System.out.println("this is a rice dish ");
    }
    public void french_fries(){
        System.out.println("french fries is originated from Belgium or France");
    }
    public static void main(String[] args) {
        Sandwich obj = new Sandwich();
        obj.noodles();
        obj.fried_rice();
        obj.french_fries();
    }
}