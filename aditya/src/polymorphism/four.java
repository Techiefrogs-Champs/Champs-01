package polymorphism;//method overloading with type promotion

public class four {
   
        static int add(int x, double y){
            return x+y;
        }
        static double add(double x,double y){
            return x+y;
        }
            
        
        public static void main(String []args){
            System.out.println(four.add(4.5,8.8));
        }     
    
}