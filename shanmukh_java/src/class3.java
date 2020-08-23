class Triangle{
    int a,b,c;
    public double area(){
      double s = (a+b+c)/2.0;
      return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double perimeter(){
      return (a+b+c)/2.0;
    }
  }
  
  class class3{
    public static void main(String[] args){
      Triangle t = new Triangle();
      t.a = 2;
      t.b = 5;
      t.c = 6;
      System.out.println(t.area());
      System.out.println(t.perimeter());
    }
  }				