package inheritance;
   
 class tiger{ 
 String eat="deer";
    int quantity =2;
    void risk(){   

    System.out.println(  "tiger eat deer");


   }

 }

   class cat extends tiger{ 

    int num=15;
    
    void danger(){ 
    System.out.println("no.of cats is"+num);
    }


}
  class rat extends tiger { 

     int groups=2;
      String name;
     void zone(){ 
     System.out.println(" cats are in groups"+groups);

     
       }



  }

    class bat extends tiger{ 

     void smile(){ 

        System.out.println( "hii");

     }


    }


public class omnivores {
           public static void main(String[] args) {
          
           cat obj1=new cat ();
           bat obj2=new bat();
           rat obj3=new rat();
            obj1.risk();
            obj1.danger();
            obj2.risk();
            obj2.smile();
            obj3.risk();
             obj3.zone();

        }



}