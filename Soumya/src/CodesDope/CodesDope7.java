package CodesDope;

class RectArea{
    private int length;
    private int breadth;
    public RectArea(int l, int b){
      length = l;
      breadth = b;
    }
    public int returnArea(){
      return length*breadth;
    }
  }
  class CodesDope7{
    public static void main(String[] args){
    RectArea r = new RectArea(2,4);
      System.out.println("RectArea of rectangle :"+r.returnArea());
    }
  }