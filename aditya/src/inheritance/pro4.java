
package inheritance;

 class Rectangle {
    int length;
    int breadth;
    Rectangle(int l,int b){
      length=l;
      breadth=b;

   }
     /*void */ public int getmethod1(){
         return length*breadth;
       // System.out.println( "the value is=" +length*breadth);
        }
      /*void*/public int  getmethod2(){
         return (length+breadth)*2;
        // System.out.println( "the value is =" +(length+breadth)*2);
     } 
}      
class Square extends Rectangle{
    int side;
    Square(int s){
        super(s,s);
       
    }
}
public class pro4{
    public static void main(String []args){
        Rectangle obj=new Rectangle(4,7);
        System.out.println(obj.getmethod1());
        System.out.println(obj.getmethod2());
        Square obj1=new Square(3);
        System.out.println(obj1.getmethod1());
        System.out.println(obj1.getmethod2());
    }
}