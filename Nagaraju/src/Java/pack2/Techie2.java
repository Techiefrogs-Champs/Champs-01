package pack2;
import pack1.*;
public class Techie2 extends Hello {
    protected void text() {
        System.out.println("Hi Techies");
        super.text();
    }

    public static void main(String[] args) {
        Techie2 obj = new Techie2();
        obj.text();
        
    }
    }
    