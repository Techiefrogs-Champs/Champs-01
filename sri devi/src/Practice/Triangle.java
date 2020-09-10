package Practice;

class side{ 
 
    public int getArea( int a,int b){ 

     return (a*b)/2;

    }

 public int getPerimeter( int a,int b,int c){ 

    return(a+b+c);
     
  }

}

public class Triangle {

    
public static void main(String[] args) {
    side obj=new side();

   System.out.println("area of triangle is"+obj.getArea(5,4));
   System.out.println(" perimeter of triangle is"+obj.getPerimeter(3,5,8));



}



}