package METHODS;

class number{ 


 public void alpha(int a,char c){
  
    
   System.out.println(  "type 1"+"  "+ a);



 }

 public void alpha( char c,int a){ 

   System.out.println("type 2"+"  "+ c);

 }


}

public class Integer {
      
  public static void main(String[] args) {
      number obj=new number();
    
      obj.alpha(45,'y');
       obj.alpha('k' ,54);

  }


}