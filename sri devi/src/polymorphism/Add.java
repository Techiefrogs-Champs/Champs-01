package polymorphism;

public class Add {
   
   public void adder( int a,int b){ 

    System.out.println( (a+b));

   }  

  public void adder(String a,String b){ 

    System.out.println((a+b));

  }

public static void main(String[] args) {
    
   Add obj=new Add();
   obj.adder( 45,55);
   obj.adder( "su","ma");

}



}