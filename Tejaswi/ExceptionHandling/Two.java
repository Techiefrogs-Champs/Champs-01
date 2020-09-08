class Two
 {
    public static void main(String args[])
{
        int a[]=new int[10];
        int k=25/0;
        try{
            a[11]=5;
            k=25/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds");
        }
        catch(ArithmeticException e){
            System.out.println("it is not divided by zero,Arithematic exception");

        }
        }
        
    }