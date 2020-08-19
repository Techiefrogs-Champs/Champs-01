package polymorphism;

public class Diff {
   
     public void minus( int a,long b){ 

      System.out.println(a+b);

     }

     public void minus (int a,int b,int c){ 

     System.out.println(a+b+c);

     }

   
    public static void main(String[] args) {
      Diff obj= new Diff () ;
      obj.minus(2,3);
      obj.minus ( 5,6,7);

    }


}