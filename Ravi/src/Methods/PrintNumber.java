package src.Methods;

public class PrintNumber {

    int a;
    String name;

//----------------------First..................
    public int PrintNumber(int a){
        System.out.println(a);
        return a;
    }
    public  void PrintNumber(int a,int b){
        System.out.println(a+b);
    }
    public String PrintNumber(String name){
        System.out.println(name);
        return name;
    }
    public  void PrintNumber(Double a){
        System.out.println(a);
    }

//----------------------Second..................
    public void PrintNumber(int a,String s){
        this.a=a;
        this.name=s;
            System.out.println("ID=" + a +" "+ "Name:=" + name);
     }
     public void PrintNumber(String s,int a){
        this.a=a;
        this.name=s;
            System.out.println("Name:" + name +" "+"ID=" + a);
      }

      
//----------------------Third..................
    // public void PrintNumber(int x)
    // {
    //     System.out.println("Area of Rectangle is  "+x*x+" sq units");
    // }
    // public void PrintNumber(int x, int y)
    // {
    //     System.out.println("Area of Square is "+x*y+" sq units");
    // }

    public static void main(String args[]) {
        PrintNumber obj=new PrintNumber();
        obj.PrintNumber(1);
        obj.PrintNumber(2, 6);
        obj.PrintNumber("ravi");
        obj.PrintNumber(5.6);
        obj.PrintNumber(12, "Ravi");
        obj.PrintNumber("Teja",13);
        obj.PrintNumber(5);
        obj.PrintNumber(11,12);

    }
}