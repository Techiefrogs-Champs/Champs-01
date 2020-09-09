public class Start3 {
    
   public static void main(String[] args) {
      
    
    String v="small";
    String v1=new String("small");
    String v2="large";
    String v3="SMALL";


   System.out.println(v.equals(v1));
    if(v.equals(v2)){

    System.out.println("this is false");
    }
    else{
     System.out.println("this is true");

    }

   if(v.equalsIgnoreCase(v3)){
    System.out.println("case is ignored");
   }

   else{
    System.out.println("case is not ignoreds");

   }


   }






}