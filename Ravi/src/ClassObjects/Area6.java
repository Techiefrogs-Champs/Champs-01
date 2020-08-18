package src.ClassObjects;

public class Area6 {

    private int length,breadth;
  
   

    public int getDIM(){
        int result= length * breadth;
        return result;
       
    }
    public void setDim(int L,int B){
       this.length=L;
       this.breadth = B;
    }

    public static void main(String []args){
        Area6 obj=new Area6();
        obj.setDim(3, 6); 
        System.out.println(obj.getDIM());            
        }
    
}