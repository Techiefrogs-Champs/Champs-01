package Abstract;

abstract class Marks {
    abstract int getPercentage(); 
}
class A extends Marks{
    int result;
    A(int a,int b,int c){
         result = (a + b + c) / 3;
    }
    int getPercentage(){
        return result;
    }
}
class B extends Marks{
    int result;
    B(int a,int b, int c,int d){
    result=(a+b+c+d)/4;
    }
    int getPercentage(){
        return result;
    }
}
class Abstexe3{
    public static void main(String[] args) {
        Marks s1=new A(50,70,80);
        Marks s2=new B(60, 2, 100, 45);
        System.out.println("Result of student 1 is :"+s1.getPercentage() + "%");
        System.out.println("Result of student 2 is :"+s2.getPercentage() + "%");
    }
}