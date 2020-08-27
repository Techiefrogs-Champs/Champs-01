package Inheritexe;

class Rectangle {
    int length;
    int breadth;
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void areaShape(){
        System.out.println(length*breadth);
    }
    public void periShape(){
        System.out.println(2*(length+breadth));
    }
}
class Square extends Rectangle{
    int side;
    public Square(int s){
        super(s, s);
    }
}
class inheritexe4{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5, 10);
        r.areaShape();
        r.periShape();
        Square s=new Square(5);
        s.areaShape();
        s.periShape();

    }
}