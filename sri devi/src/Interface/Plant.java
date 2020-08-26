package Interface;
    interface tree{ 
     
        
     void seed();

    }

class fruit implements tree{ 

    public void seed(){ 

       System.out.println( " no.of flowers is" );


    }
}
 class pollinator implements tree{ 

  public void seed(){ 

    System.out.println(" honey bees");
  }

}


public class Plant{ 


 public static void main(String[] args) {
      tree obj1=new pollinator();
    obj1.seed();

}


}





    
