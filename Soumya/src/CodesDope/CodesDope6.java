package CodesDope;

 class Area{
     int length;
     int breadth;
public int getarea(){
   int area=length*breadth;
   return area;
}
public void setDim(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
}
}
class CodesDope6{
    public static void main(String[] args) {
        Area a=new Area();
        a.setDim(4,5);
        System.out.println("Area of rectangle is :"+a.getarea());
    }
}

