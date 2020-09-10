public class instancemethod {
    int s;
    int a;
    int b;
    int c;
    public int add(int a, int b, int c) 
    {
        s= a+b+c;
        return s;
    }
    
     public static void main(String[] args){
        instancemethod obj1 = new instancemethod();
        System.out.println("The sum is: "+obj1.add(12, 58, 42));
     }

}