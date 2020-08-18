package src.InterfaceExce;


public class differentpackage implements Vehicle{
    public void run()
    {
        System.out.println("Bike is running.");
    }
   public void speed()
    {
        System.out.println("Speed of Bike: 50 Km/h");
    }
   public void speedtest()
    {
        System.out.println("This is speedtest");
    }
    public static void main(String args[])
    {
        differentpackage bike = new differentpackage();
        bike.run();
        bike.speed();
        bike.speedtest();
    }
}