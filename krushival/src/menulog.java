public class menulog {
    int order;
    String name;
    menulog( int l, String k){
        order = l;
        name  = k;
    }
    void display(){
        System.out.println(order+" "+name);}
        public static void main ( String[] args){
         menulog a=new menulog(45, "techie");
         menulog b=new menulog(62, "sydney");
            a.display();
            b.display();
        }
    

    

            
        }




    
