/*Return object of class*/
package ThisKeyword;
class Rectangle{
    int length, breadth;
    Rectangle(int l, int b){
      length = l;
      breadth = b;
    }
    Rectangle getObj(){
      return this;
    }
  }
  
  class Analyse5{
    public static void main (String[] args){
      Rectangle r1 = new Rectangle(15,20);
      Rectangle r2;
      r2 = r1.getObj();
      System.out.println("length: " + r1.length + " breadth: " + r1.breadth);
      System.out.println("length: " + r2.length + " breadth: " + r2.breadth);
    }
  }

  /*length: 15 breadth: 20
length: 15 breadth: 20 */