
/* Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number of parameters. 
The method for printing area of rectangle has two parameters which are length and 
breadth respetively while the other method for printing area of square has one parameter 
which is side of square. */

package src.Task_Methods;

public class Method_3 {
	public static void main(String[] args) {
		Area obj=new Area();
		obj.A_rea(5,6);
		obj.A_rea(5);
	}
}
class Area{
  public static void A_rea(int x,int y){
    System.out.println(x*y);
  }
  public static void A_rea(int x){
    System.out.println(x*x);
  }
}