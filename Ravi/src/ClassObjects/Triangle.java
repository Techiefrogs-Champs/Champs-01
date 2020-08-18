package src.ClassObjects;

public class Triangle {
    int a,b,c;
   
    public double area(){
        double s=(a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double PREIMETER(){
       return (a+b+c)/2.0;
    }

    // public Triangle(int a,int b,int c){
    //    this.a=a;
    //    this.b=b;
    //    this.c=c;

    // }
    // public double area1(){
    //     // double s=(a+b+c)/2.0;
    //     // return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  
    // }
    // public double PREIMETER1(){
    //    return (a+b+c)/2.0;
    // }
    public static void main(String args[]) {
        Triangle obj=new Triangle();
        obj.a=3;
        obj.b=4;
        obj.c=5;
        System.out.println(obj.area());

        // Triangle obj1=new Triangle(3,4,5);
        // System.out.println(obj1.area1());

    }
    
}