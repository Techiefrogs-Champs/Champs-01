
class Triangle{
    int a,b,c;
    public double getArea(){
      double s = (a+b+c)/2.0;
      return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getPerimeter(){
      return (a+b+c)/2.0;
    }
  }
  
  class Practice_3{
    public static void main(String[] args){
      Triangle t = new Triangle();
      t.a = 3;
      t.b = 4;
      t.c = 5;
      System.out.println("area of trianle"+t.getArea());
      System.out.println("perimeter of triangle"+t.getPerimeter());
    }
  }