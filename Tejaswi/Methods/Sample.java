class M1
{
    public void disp(int num,char c)
    {
         System.out.println(num+" "+c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       M1 obj = new M1();
       obj.disp(10,'a');
       obj.disp('a',10);
   }
}