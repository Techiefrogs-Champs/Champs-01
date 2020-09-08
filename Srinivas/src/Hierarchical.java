class English
{
   public void methodA()
   {
      System.out.println("I am english proffesor");
   }
}
class Bsc extends English
{
   public void methodB()
   {
      System.out.println("I am Bsc student i am learning english");
   }
}
class Bcom extends English
{
  public void methodC()
  {
     System.out.println("I am Bcom student i am learning english");
  }
}
class BBM extends English
{
  public void methodD()
  {
     System.out.println("I am BBM student i am learning english");
  }
}
class Hierarchical 
{
  public static void main(String args[])
  {
     Bsc obj1 = new Bsc();
    Bcom obj2 = new Bcom();
     BBM obj3 = new BBM();
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}