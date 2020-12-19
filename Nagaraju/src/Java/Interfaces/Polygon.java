/* Q-1).(a)• Create an interface called RegularPolygon with two abstract methods: getNumSides and getSideLength.
 • A class EquilateralTriangle that implements the interface, has getNumSides return 3 and 
 getSideLength return an instance variable that is set by the constructor. 
• A class Square that implements the interface, has getNumSides return 4 and getSideLength return 
an instance variable that is set by the constructor. 
(b).Add a static totalSides method, that given a RegularPolygon[], returns the sum of the 
number of sides of all the elements. 
(c).Add two default methods: 
• getPerimeter (n * length, where n is the number of sides) 
• getInteriorAngle ( (n-2)π/n in radians) 4. Make a few test cases. */

package Task_Interfaces;


public class Polygon {
    public static void main(String[] args) {
        EquilateralTriangle obj1 = new EquilateralTriangle();
            obj1.getNumSides();
            System.out.println("sum of the sides of the EquilateralTriangle: "+obj1.totalSides(3)); 
            System.out.println("Perimeter of the EquilateralTriangle: "+obj1.getPerimeter(3,3)); 
            System.out.println("InteriorAngle of the EquilateralTriangle in Radians: "+obj1.getInteriorAngle(5.6)); 
            obj1.getSideLength();
            Square obj2 = new Square();
            obj2.getNumSides();
            System.out.println("sum of the sides of the EquilateralTriangle: "+obj2.totalSides(2));  
            System.out.println("Perimeter of the EquilateralTriangle: "+obj2.getPerimeter(4,2)); 
            System.out.println("InteriorAngle of the EquilateralTriangle in Radians: "+obj2.getInteriorAngle(4.0)); 
            obj2. getSideLength();
    }
}
interface RegularPolygon{
    public abstract void getNumSides();
    public abstract void getSideLength();
    public static void totalSides(int a){  
    }
    default int getPerimeter(int x,int l){
        return x*l;
    }
    default double getInteriorAngle(Double b){
        return (b-2)*(22/7)/b;

    }
}
class EquilateralTriangle implements RegularPolygon{
    int a;
    double b;
    int x;

   int sum_of_the_sides_EquilateralTriangle;
    String ins_variable;
    public EquilateralTriangle(){
        ins_variable = "instance of EquilateralTriangle accessing from constructor";
    }
    public void getNumSides(){
        x=3;
        System.out.println("Total no of sides of the EquilateralTriangle: "+x); 
    }
    public void getSideLength(){
         System.out.println(ins_variable);
    }
    public int totalSides(int a){
        sum_of_the_sides_EquilateralTriangle = 3*a ;
        return sum_of_the_sides_EquilateralTriangle;
}
}
class Square implements RegularPolygon{
    int sum_of_the_sides_Squares;
    String ins_variable;
    int x;
    public Square(){
        ins_variable = "instance of Square accessing from constructor";
    }
    public void getNumSides(){
        x=4;
        System.out.println("Total no of sides of the Square: "+x); 
    }
    public void getSideLength(){
         System.out.println(ins_variable);
    }
    public int totalSides(int a){
         sum_of_the_sides_Squares = 4*a ;
       return sum_of_the_sides_Squares;
    }
}