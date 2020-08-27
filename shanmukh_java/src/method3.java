class area1{
    public static void area(int L,int W){
      System.out.println("area of rectangle formula is"+" "+L*W);  //area of rectangle formula is lenght*Width
    }
    public static void area (int x){
      System.out.println("area of square formula is"+" "+x*x);   //area of square formula is x*x
    }
}  
public class method3 {
     public static void main(String[] args) {
        area1 obj =new area1();
        obj.area(4, 6);
         obj.area(4);
        
    }
}