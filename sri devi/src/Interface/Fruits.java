package Interface;

interface apple{ 
  
    int num=76;
     void thorn();

}

interface guava extends apple{ 

  void spine();

}


class banana implements guava{

  public void thorn(){    
      System.out.println( "thorns on a plant is"+ num);
  }

    public void spine(){ 

    System.out.println("hi");

    } 

 }

public class Fruits {
    public static void main(String[] args) {
      banana obj=new banana();  
        obj.thorn();
        obj.spine();
    } 


}