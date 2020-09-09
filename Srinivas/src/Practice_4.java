class Triangles {
    int a,b,c;
    double s,area,perimeter;
    
    public Triangles(int x,int y,int z){
        a=x;
        b=y;
        c=z;
       
    }
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
      }
      public double getPerimeter(){
        return (a+b+c)/2.0;
    }
}
public class Practice_4{
    public static void main(String args[]){
        Triangles s1=new Triangles(3,4,5);
       System.out.println("area of triangle"+s1.getArea());
       System.out.println("perimeter of triangle"+s1.getPerimeter());
        
    }
}