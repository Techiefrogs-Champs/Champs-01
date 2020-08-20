public class Area {
    int a,l,b;
    Area(){
         l=7;
         b=3;
    }
    void getdata(){
         a=l*b;
       
    }
   public static void main(String[]args) {
       Area obj=new Area();
       obj.getdata();
       System.out.println("area ="+obj.a);

       
   }
    

    
}