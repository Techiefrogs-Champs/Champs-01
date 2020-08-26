public class Poly4 {
    void sum(int a,long k){
        System.out.println(a+k);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String []args) {
        Poly4 obj=new Poly4();
        obj.sum(5,3);
        obj.sum(6,9,9);
        
    }
}