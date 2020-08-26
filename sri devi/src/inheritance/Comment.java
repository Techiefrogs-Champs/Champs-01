package inheritance;

  class counter{
     
   public void increment( int i){
     System.out.println("i="+i);
   }

  }
  
public class Comment extends counter {
     
public static void main(String[] args) {
    
  Comment obj=new Comment();
 obj.increment(3);

}


}