package inheritance;

  class A{

   public void show( int i,int j){

   
    System.out.println("i="+i +"j="+j);

   }

  }

   class B extends A{

   public void show(int k){


    System.out.println("k="+k);
   }

  }

public class New {
     
 public static void main(String[] args) {
     
  B obj=new B();
 obj.show(45 );
  obj.show( 25) ;

 }


}