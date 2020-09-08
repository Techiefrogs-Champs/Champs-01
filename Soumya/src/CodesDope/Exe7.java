package CodesDope;
import java.util.Scanner;

class Areas {
    int length;
    int breadth;
    public Areas(int l, int b) {
        length=l;
        breadth=b;
    }
    public int returnArea(){
        return length*breadth;
    }
}
class Exe7{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("length:");
        int l= s.nextInt();
        System.out.println("breadth:");
        int b= s.nextInt();
        Areas a = new Areas(l,b);
        System.out.println(+a.returnArea());

    }
}