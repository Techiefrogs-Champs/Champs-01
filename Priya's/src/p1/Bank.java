package p1;

class Bank
{
public int getBalance()
    {
        return 0;
    }
}

class BankA extends Bank
{
    int amount;
public BankA(int a)
    {
        amount = a;
    }

    public int getBalance()
    {
        System.out.println(amount);
        return amount;
    }
}

class BankB extends Bank
{
    int amount;
public BankB(int b)
    {
        amount = b;
    }

   public int getBalance()
    {
        return amount;
    }
}

class BankC extends Bank
{
    int amount;
public BankC(int c)
    {
        amount = c;
    }

   public int getBalance()
    {
        return amount;
    }

public static void main(String[] args) 
{
    BankA a = new BankA(1000);
    BankB b = new BankB(1500);
    BankC c = new BankC(2000);
 System.out.println( a.getBalance());  
 System.out.println(b.getBalance());
     System.out.println(c.getBalance()
     );
}  
            
  
}
                 
