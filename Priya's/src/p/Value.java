package p;

class Rectangle{
    int length;
    int breadth;
    public Rectangle(int l, int b){
      length = l;
      breadth = b;
    }
    public int getArea(){
      return length*breadth;
    }
    
  }
  
  class Value{
    public static void main(String[] args){
      Rectangle a = new Rectangle(6,3);
      Rectangle a1 = new Rectangle(4,9);
      System.out.println("Area : "+a.getArea());
      System.out.println("Area : "+a1.getArea());
    }
  }							