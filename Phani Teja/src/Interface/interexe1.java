package Interface;

interface RegularPolygon {
    abstract void  getNumSides();
    abstract void getSideLength();
    static void totalSides(int s){}
    default int getPerimeter(int n,int l){
        return n*l;
    }
    default double getInteriorAngle(double a){
        return ((a-2)*(3.142)/a);
    }
    
}
class EquilateralTriangle implements RegularPolygon{
     int n;
     java.lang.String variable;

    public void getNumSides() {
        n=3;
        System.out.println("Number os sides of equilateral triangle :"+n);
    }
    public void getSideLength(){
        variable="inatance variable set by constructor";
            System.out.println(variable);
    }
}
class Square implements RegularPolygon{
    int n;
    java.lang.String variable;
    public void getNumSides(){
        n=4;
        System.out.println("Number os sides of equilateral triangle :"+n);
    }
    public void getSideLength(){
        variable="inatance variable set by constructor";
        System.out.println(variable);
    }
}
class interexe1{
    public static void main(String[] args) {
        EquilateralTriangle t=new EquilateralTriangle();
        System.out.println();
        t.getNumSides();
        t.getSideLength();
        System.out.println("perimeter of Equilateral triangle :"+t.getPerimeter(3, 4));
        System.out.println("interior angle of Equlateral triangle :"+t.getInteriorAngle(5));
        Square s=new Square();
        s.getNumSides();
        s.getSideLength();
        System.out.println("Perimeter of Square :"+t.getPerimeter(5, 5));
        System.out.println("Interior angle os Square :"+t.getInteriorAngle(4));
    }
}