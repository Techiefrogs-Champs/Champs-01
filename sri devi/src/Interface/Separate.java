package Interface;

 interface rain{

  void snow();
  void moist();

 }

 interface sunny{

   void hot();
   void sweat();
 }

interface temp{

  void smell();
  void fragrance();

}

interface dull extends rain,sunny,temp{

   void smooth(); 

}
 class active implements dull{

 public void snow(){
 System.out.println("this is interface one");
 }
 public void moist(){

 }
 public void hot(){
     System.out.println("this is interface 2");
 }

public void sweat(){


}

   public void smell(){

     System.out.println("this is interface 3"); 
   }

 public void fragrance(){

 }
 public void smooth() {
 System.out.println("this is interface 4");

 }   
 
 }

public class Separate {
    public static void main(String[] args) {
     active obj=new active();
      obj.smell();
      obj.smooth();
      obj.hot();
      obj.snow();
     

    } 
}