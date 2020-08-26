class Integer_1 {
    int number;
    char charector;
    void m(int n,char c){
        number=n;
        charector=c;
        System.out.println("number is   "+number+"\nchatecter is  "+charector);

    }
    void m(char c,int n){
        charector=c;
        number=n;
        System.out.println("chatecter is  " +charector+"\nnumber is  "+number);
    }
    
}
public class Program_2{
    public static void main(String[] args)
    {
        Integer_1 i=new Integer_1();
        i.m(12,'e');
        i.m('f',6);
    }
}