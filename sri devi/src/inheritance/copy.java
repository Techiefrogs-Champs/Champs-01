package inheritance;

class shape{ 

  public void happy(){

  System.out.println("this is shape");

  }  

}


class dot extends shape{

     public void sad(){

     System.out.println("this is rectangular shape");

     }
}

class circle extends shape{

  public void mood(){ 

  System.out.println("this is circular shape");

  }
}

class line extends dot{

    public void hint(){


  System.out.println("square is rectangle");

    }
}

public class copy {
   
  public static void main(String[] args) {
      
   line obj=new line();

      obj.happy();
      obj.sad();

  }  



}