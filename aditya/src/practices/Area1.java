package practices;

 class Areas {
       int length=5;
       int breadth=6;
    Areas(int length,int breadth ){
        
    }
   public int ReturnArea(){
        int A;
        A=length*breadth;
        System.out.println(A);
      return A;
    }
}
  public class Area1{
      public static void main(String []args){
          Areas obj= new Areas(5,6);
          obj.ReturnArea();
          
         
      }
  }
