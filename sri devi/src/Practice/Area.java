package Practice;
    class area2{ 

      void display(int l,int b){ 

     System.out.println( "area of rectangle is"+"  "+l*b);

      }

       void display( int s){  

      System.out.println("area of square is"+"  "+s*s);

       }

    }

public class Area {

  public static void main(String[] args) {
      
area2 obj=new area2();
  
obj.display(4, 5);
 obj.display(15);

  }

}
     
