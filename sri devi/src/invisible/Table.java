package invisible;

  abstract class parent{ 

   abstract void message();

  }

 class chair extends parent{ 

    void message(){

   System.out.println("this is first subclass");

    }

 } 

 class stick extends parent{
   void message(){ 

    System.out.println("this is second subclass");

   }
 }
 class Table {
      
 public static void main(String[] args) {
   parent obj=new chair();  
    parent obj1=new stick();

  obj.message();
  obj1.message();

 }



}