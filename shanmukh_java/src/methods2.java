class number{
    public void display(int num,char c)
    {
         System.out.println(+num +" "+c);
    }
    public void display(char c, int num)  
    {
         System.out.println(c + " "+num);
    }   int n;
}
public class methods2 {
   public static void main(String arg[]) {
        number obj =new number();
        obj.display(45,'S');
        obj.display('N', 67);

     
        
    }
}