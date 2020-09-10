package practices;

public class Area {
    int length;
    int breadth;
    int A;
    public int getDim(){
      return A;
      
    }
    public int getArea(int length,int breadth){
     return A=length*breadth;
     

    }
   public static void main(String []args) {
   
   Area obj=new Area();
    System.out.println(obj.getDim());
    System.out.println(obj.getArea(9,9));

   }
}
