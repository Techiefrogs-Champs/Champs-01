package p1;

class Order{ 
       
    public void orderIdentity(String name,  int id){ 
           
        System.out.println("Name :"+ name +" "+"Id :"+ id); 
    } 
       
    public void orderIdentity(int id, String name){ 
           
        System.out.println("Name :"+ name +" "+"Id :"+ id); 
    } 
} 
   
class Answer { 
    
    public static void main (String[] args) { 
           
        Order o = new Order(); 
           
        o.orderIdentity("Priya", 1); 
        o.orderIdentity("Nekkanti", 2); 
           
    } 
} 