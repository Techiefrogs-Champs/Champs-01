package Abstract;
abstract class Bank
{
 abstract int getBalance();
}
class BankA extends Bank
{
 int deposit=1020;
 int getBalance()
 {
  return deposit;
 }
}
class BankB extends Bank
{
 int deposit=1550;
 int getBalance()
 {
  return deposit;
 }
}
class BankC extends Bank
{
 int deposit=1200;
 int getBalance()
 {
  return deposit;
 }
}
public class Program_2
{
 public static void main(String args[])
 {
  
  BankA a=new BankA();
  System.out.println("Balance in Bank A: "+a.getBalance());
  
  BankB b=new BankB();
  System.out.println("Balance in Bank B: "+b.getBalance());
  
  BankC c=new BankC();
  System.out.println("Balance in Bank C: "+c.getBalance());
  
 }
}