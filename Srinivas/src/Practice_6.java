class Area {
    int length;
    int breadth;
    public double getArea (){
        double area = length * breadth;
        return area;
    }
    public void setDim(int l,int b){
        length = l;
        breadth = b;
    }
} 
    
class Practice_6{
    public static void main(String[] args){
    Area a= new Area();
    a.setDim(4,5);
    System.out.println("Area of Rectangle is:" + a.getArea());
}
}