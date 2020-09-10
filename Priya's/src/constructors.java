public class constructors {
    int year;
    int i;
    int a;
    int roll;
    String name;
    constructors(){
        System.out.println("CONSTRUCTOR");
        i=1;
        name="ABHI";
    }
    constructors(String n,int rank) {
        a= rank;
        name= n;
        
    }
    constructors(String n,int rank,int y,int r){
        name= n;
        a= rank;
        year= y ;
        roll= r ;
    } 
    public static void main(String[] args) {
        System.out.println("FIRST YEAR");
        constructors constobj = new constructors();
        System.out.println(constobj.i+" NAME OF STUDENT= "+constobj.name);
        constructors constobj1 = new constructors("PRIYA", 5);
        System.out.println(constobj1.name+" RANK OF STUDENT= "+constobj1.i);
        constructors constobj2 = new constructors("KRISHNA",3,1,2324);
        System.out.println(constobj2.name+" RANK= "+constobj2.i+" YEAR OF STUDY= "+constobj2.year+" ROLL NO= "+constobj2.roll);
       
    }   
       
}