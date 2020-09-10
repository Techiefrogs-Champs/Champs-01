package polymorphism;//method overloading with changing data types

public class two {
    
        static int add(int x,int y){
            return x+y;
        }
        static double add(double x,double y ,double z){
            return x+y+z;
        }
        static float add(float w,float x,float y,float z){
            return w+x+y+z;
        }
        
        
        
        public static void main(String []args){
            System.out.println(two.add(1,11));
            System.out.println(two.add(4.5d,14.6d,1.14d));
            System.out.println(two.add(0.1f,0.11f,1.11f,11.11f));
           
    
        }
    } 
    
