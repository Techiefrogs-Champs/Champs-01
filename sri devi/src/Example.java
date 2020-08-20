public class Example {
    
      int i;
      String y;
      int z;
 public static void main(String[] args) {
     Example obj=new Example();
     Example obj1=new Example(50,"sita");
    
      Example obj2=new Example(25,"gita",40);
     
 }  
  Example(){ 
   System.out.println("hello world" );
  } 

Example(int marks,String name){  
 i= marks;
  y=name;
  System.out.println( i+" "+y);


}
 Example(int marks,String name,int age ){

i=marks;
y=name;
z=age;
System.out.println(i+" "+y+" "+z);

 }


}

