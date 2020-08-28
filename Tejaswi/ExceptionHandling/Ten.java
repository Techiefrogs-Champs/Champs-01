class Ten
{
     public static void main(String[] args) 
{  
            try  
            {  
            int data=45/0; //may throw exception   
            }   
            catch(ArithmeticException e)  
            {  
                System.out.println(e);  
            }  
            System.out.println("code");  
        }  
          
    }  
    
    