class A1{
    int i,j;
    A1(){
        i=5;
        j=9;
    }
    void show(){
        System.out.println(" the values of i and j:"+i+ "and " +j);
    }
}
class B1 extends A1{
    int k;
    B1(){
        k=10;
    }
    void show(){
        System.out.println(" the value of k="+k);

    }
}

public class Exercise8 {
    public static void main(String[] args){
        A1 a=new A1();
        B1 b=new B1();
        a.show();
        b.show();
    }
    
}