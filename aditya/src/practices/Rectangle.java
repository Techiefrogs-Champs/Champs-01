package practices;

 class Rectangle {
    
    Rectangle(int length, int breadth){
      
    }
    public int Area(int length,int breadth){
      return length*breadth;
    }
      public int Area1(int length,int breadth){
      return length*breadth;
    }
    public static void main(String []args){
      Rectangle obj=new Rectangle(4,5);
      Rectangle obj1=new Rectangle(5,8);
     System.out.println( obj.Area(4,5));
     System.out.println(obj1.Area1(5,8));
    }
 }  