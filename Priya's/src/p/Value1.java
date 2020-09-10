package p;


class Rectangles{
    double lenght;
    double breadth;

    public double getArea(){
        double area = lenght*breadth;
        return area;
    }
    public void setDim(double lenght, double breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
}
public class Value1{
    public static void main(String[] args) {
        Rectangles R = new Rectangles();
        R.setDim(5, 8);
        System.out.println("AREA :"+R.getArea());

    }
}