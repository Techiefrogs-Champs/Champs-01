package METHODS;

 class  common{ 

 public void getdegree(){ 
  
    System.out.println( "i got degree");

 }
 }
 class undergraduate extends common{ 


   public void getdegree(){ 

   System.out.println("i am unger graduate");

   }


 }

 class postgraduate extends common{ 


  public void getdegree(){ 

  System.out.println("iam post graduate");


  }

 }

public class Degree {


   public static void main(String[] args) {
       
   
  undergraduate obj=new undergraduate();
  postgraduate obj1=new postgraduate();

  obj.getdegree();
  obj.getdegree();


   }

    
}