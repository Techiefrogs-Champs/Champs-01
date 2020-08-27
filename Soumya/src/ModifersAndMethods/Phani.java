package ModifersAndMethods;

 class M {
     M(){}
     void def(){
     System.out.println("this is private access modifier");
     }
    }     
    public class Phani{
        public static void main(String[] args) {
            M obj=new M();
            obj.def();
        }

    }
     
    
     
    
