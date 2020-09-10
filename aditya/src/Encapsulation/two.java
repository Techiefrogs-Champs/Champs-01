package Encapsulation;

 class encaps {
    
        private int id;
        private String name;
        public int getid(){
        return id;
        }
        public String getname(){
            return name;
        }
        public void setid(int id){
            this.id=id;
        }
        public void setname(String name){
            this.name=name;
        }
     }
           public class two{
           public static void main(String []args){
           encaps obj=new encaps();
           obj.setid(20);
           obj.setname("aditya");
           System.out.println("the number is =" +obj.getid());
           System.out.println("th name is =" +obj.getname());
        }
       }
    
