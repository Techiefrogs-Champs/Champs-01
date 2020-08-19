

public class Evens{
    int num=1;
    {
    if(num%2==0)
    System.out.println("even");
    else
    System.out.println("odd");

    }
    public static void main(String[] args) {
        Evens obj=new Evens();
     obj.num=6;
     System.out.println(obj.num);

    } 

    
}