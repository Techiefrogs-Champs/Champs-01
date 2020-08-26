package CodesDope;

 class Triangle {
     int a,b,c;
     public double area(){
     double s=(a+b+c)/2;
     return Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
}
public double perimeter(){
    return (a+b+c)/2;
}
 }
 class CodesDope3{
 public static void main(String[] args) {
     Triangle t=new Triangle();
     t.a=3;
     t.b=4;
     t.c=5;
     System.out.println("area of triangle :"+t.area());
     System.out.println("perimeter of triangle :"+t.perimeter());
     
 }
}
     
 
