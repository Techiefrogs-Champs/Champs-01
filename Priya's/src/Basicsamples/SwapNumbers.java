package Basicsamples;

public class SwapNumbers {
    

        public static void main(String[] args) {
    
            float first = 1.28f, second = 0.45f;
    
            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
    
        
            float temporary = first;
    
        
            first = second;
    
            
            second = temporary;
    
            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
    }
