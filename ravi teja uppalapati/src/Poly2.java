public class Poly2{
    static int sub(int a,int b){
        int sum=a-b;
        return sum;
    }

static int sub(int a,int b,int c, int d){
   int sum=a+b-c-d;
    return sum;
}    
}
class Raci{
    public static void main(String[] args) { 
        System.out.println(Poly2.sub(11,55));
    System.out.println(Poly2.sub(2,2,3,4));
        
    }
}
