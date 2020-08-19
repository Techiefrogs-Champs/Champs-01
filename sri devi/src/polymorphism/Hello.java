package polymorphism;

public class Hello {
     
public int sum( int a,int b){ 

return (a+b);

}


public int sum( int a,int b,int c){ 

return(a+b+c);


}

public static void main(String[] args){

Hello obj=new Hello() ;
  
System.out.println(obj.sum(75,68));
System.out.println(obj.sum( 78,90,5));


}



}