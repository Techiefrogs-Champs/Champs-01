class Poly1{
    static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int add(int a,int b,int c,int d){
        int sum=a+b+c;
        return sum;
   }   }
class Krishna{

public static void main(String[]args) {
    System.out.println(Poly1.add(11,55));
    System.out.println(Poly1.add(2,2,3,4));
}
    
}