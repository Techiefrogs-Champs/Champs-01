
//Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//$100, $150 and $200 are deposited in banks A, B and C respectively. 
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
//each having a method named 'getBalance'. Call this method 
//by creating an object of each of the three classes.

abstract class Bank
{
 abstract int getBalance();
}
class BankA extends Bank
{
 int deposit=100;
 int getBalance()
 {
  return deposit;
 }
}
class BankB extends Bank
{
 int deposit=150;
 int getBalance()
 {
  return deposit;
 }
}
class BankC extends Bank
{
 int deposit=200;
 int getBalance()
 {
  return deposit;
 }
}
class Main2
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