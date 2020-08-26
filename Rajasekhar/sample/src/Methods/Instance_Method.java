package Methods;

public class Instance_Method {  
    int s;  
    public int add(int a, int b) {  
        s = a+b;  
        return s;  
    } 
    public static void main(String [] args){
        Instance_Method obj = new Instance_Method();  
        System.out.println("The sum is: "+obj.add(125,175));  
        System.out.println("The sum is: "+obj.add(445,554));  
    }  
 
} 