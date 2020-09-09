package src.Exception;

public class exception {
      
    //3
        static void avg()
        {
            try
            {
            throw new ArithmeticException();
            }
            catch(ArithmeticException s)
            {
            System.out.println("Exception caught");
            }
        }
        
        //8

        double method(int i) throws Exception {
            return i/0;
         }
         boolean method(boolean b) {
            return !b;
         }
         static double method(int x, double y) throws Exception {
            return x + y ;
         }
         static double method(double x, double y) {
            return x + y - 3;
         }   


         int m;
        public void setMarks(int marks) {
            if(marks < 0 || marks > 100)
                throw new IllegalArgumentException(Integer.toString(marks));
            else
                m = marks;
        }

    public static void main(String[] args) {  
        avg();

        //2
            try{    
                int a[]=new int[5];    
                // a[5]=30/0;  
                System.out.println(a[10]);    
                }    
                catch(ArithmeticException e)  
                {  
                    System.out.println("Arithmetic Exception occurs");  
                }    
                catch(ArrayIndexOutOfBoundsException e)  
                {  
                    System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
                catch(Exception e)  
                {  
                    System.out.println("Parent Exception occurs");  
                }             
                System.out.println("rest of the code");   
                
           //5
           
           try {
                throw new Exception("throwing an exception");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
            }

        //6    
            try{
                int a[]={1,2,3,4,5};
                System.out.println(a[5]);
                try{
                    int x=a[1]/0;   

                }
                catch (ArithmeticException e2) { 
                    System.out.println("division by zero is not possible"); 
                }  
            }
            catch (ArrayIndexOutOfBoundsException e1) { 
                System.out.println("ArrayIndexOutOfBoundsException"); 
                System.out.println("Element at such index does not exists"); 
            } 

        //7
        int n = 20,result = 0;
            try{
                result = n/0;
                System.out.println("The result is"+ result);
            }catch(ArithmeticException ex){
                System.out.println("Arithmetic exception occoured: "+ex);
                try{  
                    int data = 50/0;  
                }catch(ArithmeticException e){System.out.println(e);}  
                    System.out.println("rest of the code...");  
        } 
        
        //8
        exception mn = new exception();
        try {
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(mn.method(10));
        } catch (Exception ex) {
            System.out.println("exception occoure: "+ ex);
        }

        //9

        try {
            throw new Exception("throwing an exception");
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }

    //10 -11

        int array[] = {20,20,40};
        int num1 = 14, num2 = 8;
        int res1 = 0;
        try {
            res1 = num1/num2;
            System.out.println("The result is" +res1);
            
            for(int i = 2; i >= 0; i++) {
                System.out.println("The value of array is" +array[i]);
            }
            
            //11
            for(int i = 2; i >= 0; i++) {
                System.out.println("The value of array is" +array[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Array is out of Bounds"+e);
        } catch (ArithmeticException e) {
            System.out.println ("Can't be divided by Zero"+e);
        }



        //13

        try{
            int firstNum = 20;
            int secondNum = 10;
            
            int div = firstNum/secondNum;
            System.out.println("Result : "+ div);
            }catch(ArithmeticException ae){
                System.out.println("Arithmetic Exception occurred in code");
            }
            
            System.out.println("After division");

        //14

        String str = "Hi iam Exception";
        for(int i=0; i<str.length(); i++) {
           System.out.println(str.charAt(i));
        }
        System.out.println(str.length());
        try {
           System.out.println(str.charAt(23));
        }catch(StringIndexOutOfBoundsException e) {
           System.out.println("Exception occurred . . . . . . . . ");
        }

        //15

        int arrSize = -8;
        try {
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException ex) {
            System.out.println("Can't create array of negative size");
        }

        //20
        String inputString = "123.33";   
        try {  
            int a = Integer.parseInt(inputString);  
        }catch(NumberFormatException ex){  
            System.err.println("Invalid string in argumment");  
            
        }  

        //21

                        try
                {
                    System.out.println("try block");
                    
                    throw new NullPointerException("null occurred");
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("catch block 1");
                }
                catch (NullPointerException e) 
                {
                    System.out.println("catch block 2");
                }
                catch (Exception e) 
                {
                    System.out.println("catch block 3");
                } 
                finally
                {
                    System.out.println("finally block");
                }

        //24
        try{  
		   
		    System.out.println("first statement");  
		    int array1[]=new int[5];  
		    
		    try{
		    	System.out.println("Division result "+23/0);
		        }catch(Exception e){
				System.out.println("Inner try block handled "+e.getMessage());
			 }
		    
            array1[5]=67;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("outer try block handled "+e.getMessage());  
        }
		
		  System.out.println("normal flow.."); 

        //25

        try{  
            int num=121/0;  
            System.out.println(num);  
             }  
            catch(ArithmeticException e){
                System.out.println("Number should not be divided by zero");
             }  
            finally{
            System.out.println("This is finally block");
             }  
             System.out.println("Out of try-catch-finally");  
    


 }   
}