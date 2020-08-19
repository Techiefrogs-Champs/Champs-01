package p1;

class Area{
    public static void printArea(int x,int y){
      System.out.println("Area of rectangle"+" "+ x*y);
    }
    public static void printArea(int x){
      System.out.println("Area of square"+" "+ x*x);
    }
  }
  
  class ans{
    public static void main(String[] args) {
        
      Area.printArea(2, 3);
      Area.printArea(2);
    }  
    

  }