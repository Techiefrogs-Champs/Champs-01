package Encapsulation;

public class Bank 
{
     private int accno;
     private String name;
     private float balance;
public int getAccno()
{
    return accno;
}
public void setAccno(int accno)
{
    this.accno=accno;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}
public float getBalance()
{
    return balance;
}
public void setBalance(float balance)
{
    this.balance=balance;
}

public void display()
{
    System.out.println("Account number :"+accno);
    System.out.println("Name of the account holder :"+name);
    System.out.println("Balance :"+balance);
}
}