class Rectangle{
    int length;
    int breadth;
    public Rectangle(int l, int b){
      length = l;
      breadth = b;
    }
    public int area(){
      return length*breadth;
    }
    public int perimeter(){
      return 2*(length+breadth);
    }
  }
  
  class class4{
    public static void main(String[] args){
      Rectangle a = new Rectangle(4,5);
      Rectangle b = new Rectangle(5,8);
      System.out.println("Area : "+a.area()+" Perimeter is "+a.perimeter());
      System.out.println("Area : "+b.area()+" Perimeter is "+b.perimeter());
    }
}