package practices;

 class complex {
    
    public int method1(int a,int b){
        int addition;
        return addition=a+b;
    }
    public int method2(int x,int y){
        int product; 
        return product=x*y;

    }
    public int method3(int k,int M){
        int subtraction;
        return subtraction=k-M;

    }
    public static void main(String []args){
        complex add =new complex();
        System.out.println(add.method1(2,5));
        System.out.println(add.method2(3,9));
        System.out.println(add.method3(6,4));
    } 
}