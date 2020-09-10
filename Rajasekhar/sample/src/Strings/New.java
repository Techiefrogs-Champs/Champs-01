package Strings;
class New {     
    public static void main(String args[]) 
    {
      
        try 
    	            {
	                throw new NullPointerException ("Hello");
        	            }
        	            catch(ArithmeticException e)
        	            {
    	        	System.out.print("B");        	
    	            }
    }
}