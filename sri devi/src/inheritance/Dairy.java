package inheritance;

  class cow{ 
    
   void milk(){  

    System.out.println(" cows present");
   }

  }

   class calf extends  cow{

      int num=12;
      String name="Ramu";
       void member(){

     System.out.println(" number of calf is" +num);

     }


       }


     class dog extends calf{  

        int types=5;
        String breed="german shepard";
          void hair(){

         System.out.println( "welcome");
          }


     }
    

     class Dairy {

    public static void main(String[] args) {
       
      dog d=new dog();
      d.milk();
      d.hair();
      d.member();

      
   }
    
}