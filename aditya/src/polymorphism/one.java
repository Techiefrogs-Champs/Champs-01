package polymorphism;//method overloading with different parameters 

public class one {
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    static int adding(int w,int x,int y,int z){
        return w+x+y+z;
    }
    static int add(int v,int w,int x, int y, int z){
        return v+w+x+y+z;
    }
    public static void main(String []args){
        System.out.println(one.add(30,91));
        System.out.println(one.add(45,146,114));
        System.out.println(one.adding(79,31,181,1567));
        System.out.println(one.add(38,61,171,11896,13711));

    }
} 