class sample {
    int i;
    int a;
    String name;
    sample(){
        System.out.println("CONSTRUCTOR");
        i=1;
        name="ABHI";
    }
    sample(String n,int rank) {
        n= name ;
        i= rank ;
        
    }
    sample(String n,int age,int rank){
      n= name ;
      i= rank ;
      a= age ;
    
    } 

} 
public class mainsample{

     public static void main(String[] args) {
         System.out.println("CLASS STUDENTS");
         sample obj = new sample();
         System.out.println(obj.i+" "+obj.name);
         sample obj1 = new sample("PRIYA", 12);
         System.out.println(obj1.name+" "+obj1.i);
         sample obj2 = new sample("krishna", 21, 2);
         System.out.println(obj2.name+" "+obj2.a+" "+obj2.i);

        
    }
        
    }
