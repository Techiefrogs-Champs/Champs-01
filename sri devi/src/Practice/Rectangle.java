package Practice;


class length{ 

  
    
   public int getArea( int l, int b){ 
     return l*b ;

   } 

    public int getPerimeter( int l, int b){ 

     return 2*(l+b);

    } 


}

public class Rectangle { 


 public static void main(String[] args) {
  length a=new length();    
 System.out.println( a.getArea (10,11));
 System.out.println( a.getPerimeter(15,12));
 }


    
}