package src.InterfaceExce;

import src.Accesmodifier.publc;

interface F1{
    void one();
}

public class OneMethod implements F1{

    public void one(){
        System.out.println("This is at least one method");
    }

    public static void main(String args[])
    {
        OneMethod obj=new OneMethod();
        obj.one();


    }

}