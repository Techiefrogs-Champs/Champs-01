package src.Method;

public class InstanceMethod {

    public int c;
   
    public int add(int a,int b){ //  this method is instance method because we dont write static method

        c=a+b;
        return c;
    }

    public int size() { // An instance method.
        return 10;
    }

    public static void main(String args[]) {

        InstanceMethod obj=new InstanceMethod();
        System.out.println("The sume is:"+obj.add(3, 4));
        int value = obj.size();
        System.out.println(222);
        
    }

}