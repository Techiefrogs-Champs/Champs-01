package p;
class Sides{
    int a,b,c;
    public double getArea(){
      double s = (a+b+c)/2.0;
      return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getPerimeter(){
      return (a+b+c)/2.0;
    }
  }
  
  class Triangle{
    public static void main(String[] args){
      Sides s = new Sides();
      s.a = 3;
      s.b = 4;
      s.c = 5;
      System.out.println(s.getArea());
      System.out.println(s.getPerimeter());
    }
  }								
  