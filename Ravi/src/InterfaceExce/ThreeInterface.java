package src.InterfaceExce;


interface If1 {
	void m1();
	void m2();
}

interface If2 {
	void m3();
	void m4();
}

interface If3 {
	void m5();
	void m6();
}
interface If4 extends If1, If2, If3 {
	void m7();
}

class   class1{
    private int i = 0;
	public void doc() {}
}
class class2 extends class1 implements If4 {
	
    public void m1() {System.out.println("This is M1 method");}
    public void m2() {System.out.println("This is M2 method");}
    public void m3() {System.out.println("This is M3 method");}
    public void m4() {System.out.println("This is M4 method");}
    public void m5() {System.out.println("This is M5 method");}
    public void m6() {System.out.println("This is M6 method");}
    public void m7() {System.out.println("This is M7 method");}
	
}


public class ThreeInterface extends class2{
    public static void main(String args[]){
        ThreeInterface obj=new ThreeInterface();
        obj.m1();
       
       
        
    }
    
}