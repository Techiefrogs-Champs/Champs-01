class GCD 
{
  public static void main(String[] args) 
{
       int n1 = 4, n2 = 12;
       while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
    }
}