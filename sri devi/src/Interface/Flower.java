package Interface;

 interface rose{ 
     int num=15;
  void petals();

 }

 interface marigold{ 

    int type=45;
  void colour();

 }



 class Flower implements rose ,marigold { 

   public void petals(){ 
    System.out.println(  "flowers are red in colour" + num);

   }
   public void colour(){ 

    System.out.println( " beautiful flower");

   }
     
    public static void main(String[] args) {
        Flower small=new Flower();
        small.petals();
        small.colour();

    }


}