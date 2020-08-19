class corner{
    int i;
    String name;
        corner(){
         System.out.println("default constructor");
        }
     
        corner(int i){//one parameterised constructor
        System.out.println("constructor of one parameter is = " +i );
    
        }
      
       
      corner( int i, String name){//two parameterised constructor
        System.out.println("constuctor of two parameters  is  ="    +i    +name);           
        }
      }
        public class corners{
          public static void main(String []args) {
         
            corner obj1=new corner();
            corner obj2=new corner(5);
            corner obj3=new corner(6 , "aditya");
             
        
        }
        }
    
    
