package inheritance;
 class bottle{

 private  void water(){ 
 System.out.println("good morning");

}

}

 class cup extends bottle{ 

  void milk(){ 
 System.out.println("good afternoon");

  }

 }

public class Plastic {
 public static void main(String[] args) {
     bottle obj=new bottle();
     cup obj1=new cup();
     water.obj();
      milk.obj1();
 }     



}