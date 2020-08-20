 class sample {
    int i;
      String y;
      int z; 

      sample(){ 
        System.out.println("hello world" );
       } 
     
     sample(int marks,String name){  
      i= marks;
       y=name;
     
     
     
     }
      sample(int marks,String name,int age ){
     
     i=marks;
     y=name;
     z=age;
     
     
      }
     
   public class mainsample{

    public  void main(String[] args) {
        sample obj=new sample();
        sample obj1=new sample(50,"sita");
        System.out.println( obj1.i+" "+obj1.y);
         sample obj2=new sample(25,"gita",40);
         System.out.println(obj2.i+" "+obj2.y+" "+obj2.z);
    }  



   }
    
   } 
    
     










