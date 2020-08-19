package p;

class Side{
    int a,b,c;
    
    

    public double getArea(int a, int b, int c) {
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
      }
      public double getPerimeter(int a, int b, int c){
        return (a+b+c)/2.0;
      }
}

public class Triangle1 {
    public static void main(String[] args) {
        Side s = new Side();
     System.out.println( s.getArea(4, 5, 6));
     System.out.println(  s.getPerimeter(4, 5, 6));
    }
    
}